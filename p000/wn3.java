package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class wn3 extends Fragment {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f33519a = 0;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ck2 ck2Var = ek2.Companion;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ck2 ck2Var = ek2.Companion;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        ck2 ck2Var = ek2.Companion;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ck2 ck2Var = ek2.Companion;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ck2 ck2Var = ek2.Companion;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        ck2 ck2Var = ek2.Companion;
    }

    /* JADX INFO: renamed from: wn3$a */
    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static final class C1300a implements Application.ActivityLifecycleCallbacks {
        public static final vn3 Companion = new vn3();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C1300a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = wn3.f33519a;
            un3.m11587a(activity, ek2.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = wn3.f33519a;
            un3.m11587a(activity, ek2.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = wn3.f33519a;
            un3.m11587a(activity, ek2.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = wn3.f33519a;
            un3.m11587a(activity, ek2.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = wn3.f33519a;
            un3.m11587a(activity, ek2.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = wn3.f33519a;
            un3.m11587a(activity, ek2.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
