package com.plcoding.bookpedia.book.presentation.book_list.viewmodel

import androidx.lifecycle.ViewModel
import com.plcoding.bookpedia.book.presentation.book_list.BookListAction
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookListViewModel : ViewModel() {

    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()

    fun onAction(bookListAction: BookListAction) {
        when (bookListAction) {
            is BookListAction.OnBookClick -> {


            }

            is BookListAction.OnSearchQueryChange -> {
                _state.update {
                    it.copy(searchQuery = bookListAction.query)
                }
            }

            is BookListAction.OnTabSelected -> {
                _state.update {
                    it.copy(selectTabIndex = bookListAction.index )
                }
            }
        }

    }
}