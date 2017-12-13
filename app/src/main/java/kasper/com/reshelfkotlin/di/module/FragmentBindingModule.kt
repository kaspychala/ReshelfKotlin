package kasper.com.reshelfkotlin.di.module


import android.support.v4.app.Fragment
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import dagger.Binds
import dagger.Module
import dagger.android.support.FragmentKey
import kasper.com.reshelfkotlin.ui.home.HomeFragment
import kasper.com.reshelfkotlin.ui.home.HomeFragmentComponent


/**
 * Created by Kasper on 13.12.2017.
 */
@Module(subcomponents = arrayOf(HomeFragmentComponent::class))
abstract class FragmentBindingModule {

    @Binds
    @IntoMap
    @FragmentKey(HomeFragment::class)
    internal abstract fun bindHomeFragment(builder: HomeFragmentComponent.Builder): AndroidInjector.Factory<out Fragment>

}