package kasper.com.reshelfkotlin.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import kasper.com.reshelfkotlin.di.module.ActivityBindingModule
import kasper.com.reshelfkotlin.App


/**
 * Created by Kasper on 13.12.2017.
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ActivityBindingModule::class))
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}