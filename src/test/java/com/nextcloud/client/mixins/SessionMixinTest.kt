package com.nextcloud.client.mixins

import android.app.Activity
import android.content.ContentResolver
import com.nextcloud.client.account.UserAccountManager
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.same
import org.mockito.MockitoAnnotations

class SessionMixinTest {

    @Mock
    private lateinit var activity: Activity

    @Mock
    private lateinit var contentResolver: ContentResolver

    @Mock
    private lateinit var userAccountManager: UserAccountManager

    private lateinit var session: SessionMixin

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        session = SessionMixin(
            activity,
            contentResolver,
            userAccountManager
        )
    }

    @Test
    fun `start account creation`() {
        // WHEN
        //      start account creation flow
        session.startAccountCreation()

        // THEN
        //      start is delegated to account manager
        //      account manager receives parent activity
        verify(userAccountManager).startAccountCreation(same(activity))
    }
}
