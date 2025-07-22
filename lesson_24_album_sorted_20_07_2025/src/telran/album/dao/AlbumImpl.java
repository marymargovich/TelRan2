package telran.album.dao;

import telran.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    private Photo[] photos;
    private int size;


    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }


    @Override
    public boolean addPhoto(Photo photo) {
        if (size == photos.length || photo == null
                || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos, 0, size, photo);
        index = index < 0 ? -index - 1 : index;
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }


    @Override
    public boolean removePhoto(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (photos[i].equals(pattern)) {
                System.arraycopy(photos, i + 1, photos, i, size - i - 1);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (photo == null) {
            return false;
        }
        photo.setUrl(url);
        return true;
    }


    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (photos[i].equals(pattern)) {
                return photos[i];
            }
        }
        return null;
    }


    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {

        return getPhotosByPredicate(photo -> photo.getAlbumId()== albumId);
    }


    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return getPhotosByPredicate(photo ->
                !photo.getDate().toLocalDate().isBefore(dateFrom)
                && !photo.getDate().toLocalDate().isAfter(dateTo));
    };


    @Override
    public int size() {
        return size;
    }


    private Photo[] getPhotosByPredicate(Predicate<Photo> condition){

        int count = 0;
        for (int i = 0; i < size; i++) {
            if(condition.test(photos[i])){
                count++;
        }
    }

        Photo[] result = new Photo[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if( condition.test(photos[i])){
                result[ index++] = photos[i];
            }
        }
            return result;

}
}