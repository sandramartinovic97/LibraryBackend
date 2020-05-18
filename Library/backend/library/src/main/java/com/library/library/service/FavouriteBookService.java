package com.library.library.service;

import com.library.library.model.Customer;
import com.library.library.model.FavouriteBook;

import java.util.Collection;

public interface FavouriteBookService {
    public Collection<FavouriteBook> getAllFavouriteBooks();
    public FavouriteBook getFavouriteBook(Integer id);
    public boolean existsById(Integer id);
    public void deleteFavouriteBookById(Integer id);
    public FavouriteBook updateFavouriteBook(FavouriteBook favouritebook,Integer id);
    public FavouriteBook insertFavouriteBook(FavouriteBook favouritebook);
}
