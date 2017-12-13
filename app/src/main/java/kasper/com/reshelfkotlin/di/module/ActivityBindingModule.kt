package kasper.com.reshelfkotlin.di.module

import dagger.Module
import kasper.com.reshelfkotlin.ui.main.MainActivity
import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds
import kasper.com.reshelfkotlin.ui.main.MainActivityComponent


/**
 * Created by Kasper on 13.12.2017.
 */
@Module(subcomponents = arrayOf(MainActivityComponent::class))
abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>
}