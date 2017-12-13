package kasper.com.reshelfkotlin.ui.home

import dagger.Module
import kasper.com.reshelfkotlin.di.module.FragmentModule
import dagger.android.AndroidInjector
import dagger.Subcomponent
import kasper.com.reshelfkotlin.di.scope.PerFragment


/**
 * Created by Kasper on 13.12.2017.
 */
@PerFragment
@Subcomponent(modules = arrayOf(HomeFragmentComponent.HomeModule::class))
interface HomeFragmentComponent : AndroidInjector<HomeFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<HomeFragment>()

    @Module
    class HomeModule : FragmentModule<HomeFragment, HomeView>()

}