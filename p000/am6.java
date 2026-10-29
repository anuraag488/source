package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class am6 extends kl5 {
    /* JADX INFO: renamed from: N */
    public final a02 m3048N(v23 v23Var, String str, int i) {
        Parcel parcelM7550G = m7550G();
        nv5.m8863b(parcelM7550G, v23Var);
        parcelM7550G.writeString(str);
        parcelM7550G.writeInt(i);
        Parcel parcelM7548E = m7548E(parcelM7550G, 2);
        a02 a02VarM11709I = v23.m11709I(parcelM7548E.readStrongBinder());
        parcelM7548E.recycle();
        return a02VarM11709I;
    }

    /* JADX INFO: renamed from: O */
    public final a02 m3049O(v23 v23Var, String str, int i) {
        Parcel parcelM7550G = m7550G();
        nv5.m8863b(parcelM7550G, v23Var);
        parcelM7550G.writeString(str);
        parcelM7550G.writeInt(i);
        Parcel parcelM7548E = m7548E(parcelM7550G, 4);
        a02 a02VarM11709I = v23.m11709I(parcelM7548E.readStrongBinder());
        parcelM7548E.recycle();
        return a02VarM11709I;
    }

    /* JADX INFO: renamed from: P */
    public final a02 m3050P(v23 v23Var, String str, boolean z, long j) {
        Parcel parcelM7550G = m7550G();
        nv5.m8863b(parcelM7550G, v23Var);
        parcelM7550G.writeString(str);
        parcelM7550G.writeInt(z ? 1 : 0);
        parcelM7550G.writeLong(j);
        Parcel parcelM7548E = m7548E(parcelM7550G, 7);
        a02 a02VarM11709I = v23.m11709I(parcelM7548E.readStrongBinder());
        parcelM7548E.recycle();
        return a02VarM11709I;
    }

    /* JADX INFO: renamed from: Q */
    public final a02 m3051Q(v23 v23Var, String str, int i, v23 v23Var2) {
        Parcel parcelM7550G = m7550G();
        nv5.m8863b(parcelM7550G, v23Var);
        parcelM7550G.writeString(str);
        parcelM7550G.writeInt(i);
        nv5.m8863b(parcelM7550G, v23Var2);
        Parcel parcelM7548E = m7548E(parcelM7550G, 8);
        a02 a02VarM11709I = v23.m11709I(parcelM7548E.readStrongBinder());
        parcelM7548E.recycle();
        return a02VarM11709I;
    }
}
