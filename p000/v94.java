package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v94 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static w94 m11772a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = v94.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new w94();
        }
        ua3 ua3VarMo20e = q84.f28304b.mo20e();
        for (int i2 = 0; i2 < i; i2++) {
            ua3VarMo20e.add(parcel.readValue(classLoader));
        }
        return new w94(ua3VarMo20e.m11354c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m11772a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new w94[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m11772a(parcel, classLoader);
    }
}
