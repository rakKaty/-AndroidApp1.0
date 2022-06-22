package ru.netology.nmedia.ViewModel

import androidx.lifecycle.ViewModel
import ru.netology.nmedia.data.Impl.InMemoryPostRepository
import ru.netology.nmedia.data.PostRepository

class PostViewModel : ViewModel() {

    private val repository: PostRepository = InMemoryPostRepository()

    val data by repository::data
    //val data get() = repository.data  - тоже самое

    fun onLikeClicked() = repository.like()

    fun onShareClicked() = repository.share()


}