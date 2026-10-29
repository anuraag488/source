package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v23 extends mh5 implements a02 {

    /* JADX INFO: renamed from: j */
    public Object f32347j;

    /* JADX INFO: renamed from: I */
    public static a02 m11709I(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a02 ? (a02) iInterfaceQueryLocalInterface : new vr5(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 2);
    }

    /* JADX INFO: renamed from: J */
    public static Object m11710J(a02 a02Var) {
        if (a02Var instanceof v23) {
            return ((v23) a02Var).f32347j;
        }
        IBinder iBinderAsBinder = a02Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            qm5.m9913d(String.valueOf(length).length() + 53, length, "Unexpected number of IObjectWrapper declared fields: ");
            return null;
        }
        y42.m12854a0(field);
        if (field.isAccessible()) {
            C1077qn.m9987m("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    /* JADX INFO: renamed from: K */
    public static v23 m11711K(Object obj) {
        v23 v23Var = new v23("com.google.android.gms.dynamic.IObjectWrapper", (byte) 4);
        v23Var.f32347j = obj;
        VarHandle.storeStoreFence();
        return v23Var;
    }
}
