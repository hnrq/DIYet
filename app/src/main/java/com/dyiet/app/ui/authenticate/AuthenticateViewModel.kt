package com.dyiet.app.ui.authenticate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dyiet.app.data.repository.AuthenticationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthenticateViewModel @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
): ViewModel() {
    private val _email = MutableStateFlow("")
    val email: Flow<String> = _email

    fun onEmailChange(email: String) {
        _email.value = email
    }

    fun onSignIn() {
        viewModelScope.launch {
            authenticationRepository.signIn(email = _email.value)
        }
    }

    fun onGoogleSignIn() {
        viewModelScope.launch {
            authenticationRepository.signInWithGoogle()
        }
    }
}