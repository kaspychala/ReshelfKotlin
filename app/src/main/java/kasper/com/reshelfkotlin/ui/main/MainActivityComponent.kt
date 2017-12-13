package kasper.com.reshelfkotlin.ui.main


import dagger.Module
import kasper.com.reshelfkotlin.di.module.ActivityModule
import dagger.android.AndroidInjector
import dagger.Subcomponent
import kasper.com.reshelfkotlin.di.module.FragmentBindingModule
import kasper.com.reshelfkotlin.di.scope.PerActivity


/**
 * Created by Kasper on 13.12.2017.
 */
@PerActivity
@Subcomponent(modules = arrayOf(MainActivityComponent.MainModule::class, FragmentBindingModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    @Module
    class MainModule : ActivityModule<MainActivity, MainView>()

}