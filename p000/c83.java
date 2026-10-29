package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c83 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15873a;

    public /* synthetic */ c83(byte b) {
        this.f15873a = b;
    }

    /* JADX INFO: renamed from: a */
    public static d83 m3891a(Parcel parcel, ClassLoader classLoader) {
        r94 r94Var;
        if (classLoader == null) {
            classLoader = c83.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            r94Var = o85.f26450j;
        } else if (i == 1) {
            r94Var = ia5.f21230u;
        } else {
            if (i != 2) {
                C1077qn.m9989o(c75.m3878j("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            r94Var = o85.f26454n;
        }
        return new d83(value, r94Var);
    }

    /* JADX INFO: renamed from: b */
    public static ba4 m3892b(Parcel parcel, ClassLoader classLoader) {
        ba4 ba4Var = new ba4();
        if (classLoader == null) {
            classLoader = ba4.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            ba4Var.add(parcel.readValue(classLoader));
        }
        return ba4Var;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f15873a) {
            case 0:
                return m3891a(parcel, classLoader);
            default:
                return m3892b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f15873a) {
            case 0:
                return new d83[i];
            default:
                return new ba4[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15873a) {
            case 0:
                return m3891a(parcel, null);
            default:
                return m3892b(parcel, null);
        }
    }
}
