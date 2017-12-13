package kasper.com.reshelfkotlin.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import kasper.com.reshelfkotlin.di.scope.PerActivity
import kasper.com.reshelfkotlin.ui.base.BaseActivity
import kasper.com.reshelfkotlin.ui.base.BaseView


/**
 * Created by Kasper on 13.12.2017.
 */
@Module
abstract class ActivityModule<in A : BaseActivity<*, *>, out V : BaseView> {

    @Provides
    @PerActivity
    fun provideView(activity: A): V {
        return activity as V
    }

    @Provides
    @PerActivity
    fun provideActivityContext(activity: A): Context {
        return activity
    }


}