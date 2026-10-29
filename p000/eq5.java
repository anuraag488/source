package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eq5 extends kl5 implements nq5 {
    /* JADX INFO: renamed from: N */
    public final int m5279N(String str, int i, String str2) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(i);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        Parcel parcelM7556M = m7556M(parcelM7555L, 1);
        int i2 = parcelM7556M.readInt();
        parcelM7556M.recycle();
        return i2;
    }

    /* JADX INFO: renamed from: O */
    public final int m5280O(int i, String str, String str2, Bundle bundle) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(i);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        int i2 = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        Parcel parcelM7556M = m7556M(parcelM7555L, 10);
        int i3 = parcelM7556M.readInt();
        parcelM7556M.recycle();
        return i3;
    }

    /* JADX INFO: renamed from: P */
    public final Bundle m5281P(String str, String str2, Bundle bundle) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(9);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        int i = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        Parcel parcelM7556M = m7556M(parcelM7555L, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: Q */
    public final Bundle m5282Q(String str, String str2, Bundle bundle) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(9);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        int i = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        Parcel parcelM7556M = m7556M(parcelM7555L, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: R */
    public final Bundle m5283R(String str, String str2, String str3) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(3);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        parcelM7555L.writeString(str3);
        parcelM7555L.writeString(null);
        Parcel parcelM7556M = m7556M(parcelM7555L, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: S */
    public final Bundle m5284S(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(i);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        parcelM7555L.writeString(str3);
        parcelM7555L.writeString(null);
        int i2 = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        Parcel parcelM7556M = m7556M(parcelM7555L, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: T */
    public final Bundle m5285T(String str, String str2, String str3) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(3);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        parcelM7555L.writeString(str3);
        Parcel parcelM7556M = m7556M(parcelM7555L, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: U */
    public final Bundle m5286U(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(i);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        parcelM7555L.writeString(str3);
        int i2 = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        Parcel parcelM7556M = m7556M(parcelM7555L, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: V */
    public final Bundle m5287V(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(i);
        parcelM7555L.writeString(str);
        parcelM7555L.writeString(str2);
        int i2 = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        parcelM7555L.writeInt(1);
        bundle2.writeToParcel(parcelM7555L, 0);
        Parcel parcelM7556M = m7556M(parcelM7555L, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) dr5.m4663a(parcelM7556M);
        parcelM7556M.recycle();
        return bundle3;
    }

    /* JADX INFO: renamed from: W */
    public final void m5288W(String str, Bundle bundle, fw5 fw5Var) {
        Parcel parcelM7555L = m7555L();
        parcelM7555L.writeInt(25);
        parcelM7555L.writeString(str);
        int i = dr5.f17310a;
        parcelM7555L.writeInt(1);
        bundle.writeToParcel(parcelM7555L, 0);
        parcelM7555L.writeStrongBinder(fw5Var);
        try {
            this.f23220b.transact(2101, parcelM7555L, null, 1);
        } finally {
            parcelM7555L.recycle();
        }
    }
}
