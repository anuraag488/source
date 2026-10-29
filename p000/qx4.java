package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx4 {

    /* JADX INFO: renamed from: a */
    public C0805jo f28869a;

    /* JADX INFO: renamed from: b */
    public C0805jo f28870b;

    /* JADX INFO: renamed from: c */
    public C0805jo f28871c;

    /* JADX INFO: renamed from: a */
    public abstract rx4 mo10157a();

    /* JADX INFO: renamed from: b */
    public final Class m10158b(Class cls) throws ClassNotFoundException {
        C0805jo c0805jo = this.f28871c;
        Class cls2 = (Class) c0805jo.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0805jo.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m10159c(String str) throws NoSuchMethodException {
        C0805jo c0805jo = this.f28869a;
        Method method = (Method) c0805jo.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, qx4.class.getClassLoader()).getDeclaredMethod("read", qx4.class);
        c0805jo.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m10160d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        C0805jo c0805jo = this.f28870b;
        Method method = (Method) c0805jo.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM10158b = m10158b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM10158b.getDeclaredMethod("write", cls, qx4.class);
        c0805jo.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo10161e(int i);

    /* JADX INFO: renamed from: f */
    public final Parcelable m10162f(Parcelable parcelable, int i) {
        if (!mo10161e(i)) {
            return parcelable;
        }
        return ((rx4) this).f29710e.readParcelable(rx4.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final sx4 m10163g() {
        String string = ((rx4) this).f29710e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (sx4) m10159c(string).invoke(null, mo10157a());
        } catch (ClassNotFoundException e) {
            xy4.m12785n("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            xy4.m12785n("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            xy4.m12785n("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            xy4.m12785n("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo10164h(int i);

    /* JADX INFO: renamed from: i */
    public final void m10165i(sx4 sx4Var) {
        if (sx4Var == null) {
            ((rx4) this).f29710e.writeString(null);
            return;
        }
        try {
            ((rx4) this).f29710e.writeString(m10158b(sx4Var.getClass()).getName());
            rx4 rx4VarMo10157a = mo10157a();
            try {
                m10160d(sx4Var.getClass()).invoke(null, sx4Var, rx4VarMo10157a);
                Parcel parcel = rx4VarMo10157a.f29710e;
                int i = rx4VarMo10157a.f29714i;
                if (i >= 0) {
                    int i2 = rx4VarMo10157a.f29709d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                xy4.m12785n("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                xy4.m12785n("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                xy4.m12785n("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                xy4.m12785n("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            xy4.m12785n(sx4Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
