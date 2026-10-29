package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cv3 {

    /* JADX INFO: renamed from: a */
    public static final List f16508a = kx5.m7694Y(Application.class, qu3.class);

    /* JADX INFO: renamed from: b */
    public static final List f16509b = Collections.singletonList(qu3.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m4172a(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listM9215j0 = AbstractC0990oo.m9215j0(constructor.getParameterTypes());
            if (list.equals(listM9215j0)) {
                return constructor;
            }
            if (list.size() == listM9215j0.size() && listM9215j0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final jy4 m4173b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (jy4) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            ds3.m4668l("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            xy4.m12785n("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
