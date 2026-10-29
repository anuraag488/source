package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ly4 extends ny4 {

    /* JADX INFO: renamed from: c */
    public static ly4 f24471c;

    /* JADX INFO: renamed from: d */
    public static final i50 f24472d = new i50((byte) 22);

    /* JADX INFO: renamed from: b */
    public final Application f24473b;

    public ly4(Application application) {
        this.f24473b = application;
    }

    /* JADX INFO: renamed from: d */
    public static jy4 m8148d(Class cls, Application application) {
        if (!AbstractC0576di.class.isAssignableFrom(cls)) {
            return AbstractC0647fd.m5684w(cls);
        }
        try {
            return (jy4) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            ds3.m4668l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            ds3.m4668l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ds3.m4668l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            ds3.m4668l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // p000.ny4, p000.my4
    /* JADX INFO: renamed from: a */
    public final jy4 mo3725a(Class cls) {
        Application application = this.f24473b;
        if (application != null) {
            return m8148d(cls, application);
        }
        qm5.m9919j("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // p000.ny4, p000.my4
    /* JADX INFO: renamed from: b */
    public final jy4 mo3726b(Class cls, gv2 gv2Var) {
        if (this.f24473b != null) {
            return mo3725a(cls);
        }
        Application application = (Application) gv2Var.f17298a.get(f24472d);
        if (application != null) {
            return m8148d(cls, application);
        }
        if (!AbstractC0576di.class.isAssignableFrom(cls)) {
            return AbstractC0647fd.m5684w(cls);
        }
        C1077qn.m9987m("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
