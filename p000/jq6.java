package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jq6 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22529a;

    public /* synthetic */ jq6(byte b) {
        this.f22529a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zM11829M = false;
        switch (this.f22529a) {
            case 0:
                int iM11839W = vd6.m11839W(parcel);
                String strM11853l = null;
                long jM11832P = -1;
                int iM11831O = 0;
                int iM11831O2 = 0;
                while (parcel.dataPosition() < iM11839W) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        zM11829M = vd6.m11829M(parcel, i);
                    } else if (c == 2) {
                        strM11853l = vd6.m11853l(parcel, i);
                    } else if (c == 3) {
                        iM11831O = vd6.m11831O(parcel, i);
                    } else if (c == 4) {
                        iM11831O2 = vd6.m11831O(parcel, i);
                    } else if (c != 5) {
                        vd6.m11836T(parcel, i);
                    } else {
                        jM11832P = vd6.m11832P(parcel, i);
                    }
                }
                vd6.m11858q(parcel, iM11839W);
                fp6 fp6Var = new fp6();
                fp6Var.f19219d = zM11829M;
                fp6Var.f19220e = strM11853l;
                fp6Var.f19221f = z16.m13289a(iM11831O) - 1;
                fp6Var.f19222g = jv5.m7299a(iM11831O2) - 1;
                fp6Var.f19223h = jM11832P;
                VarHandle.storeStoreFence();
                return fp6Var;
            default:
                int iM11839W2 = vd6.m11839W(parcel);
                int iM11831O3 = 0;
                int iM11831O4 = 0;
                int iM11831O5 = 0;
                boolean zM11829M2 = false;
                boolean zM11829M3 = false;
                while (parcel.dataPosition() < iM11839W2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iM11831O3 = vd6.m11831O(parcel, i2);
                    } else if (c2 == 2) {
                        zM11829M2 = vd6.m11829M(parcel, i2);
                    } else if (c2 == 3) {
                        zM11829M3 = vd6.m11829M(parcel, i2);
                    } else if (c2 == 4) {
                        iM11831O4 = vd6.m11831O(parcel, i2);
                    } else if (c2 != 5) {
                        vd6.m11836T(parcel, i2);
                    } else {
                        iM11831O5 = vd6.m11831O(parcel, i2);
                    }
                }
                vd6.m11858q(parcel, iM11839W2);
                return new br3(iM11831O3, iM11831O4, iM11831O5, zM11829M2, zM11829M3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f22529a) {
            case 0:
                return new fp6[i];
            default:
                return new br3[i];
        }
    }
}
