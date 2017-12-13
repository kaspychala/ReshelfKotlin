package kasper.com.reshelfkotlin

import android.content.Context
import android.support.multidex.MultiDex
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import kasper.com.reshelfkotlin.di.component.DaggerAppComponent

/**
 * Created by Kasper on 13.12.2017.
 */
class App : DaggerApplication() {


    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}