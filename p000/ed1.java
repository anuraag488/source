package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ed1> CREATOR = new qo5(5);

    /* JADX INFO: renamed from: d */
    public final String f18013d;

    /* JADX INFO: renamed from: e */
    public final int f18014e;

    /* JADX INFO: renamed from: f */
    public final long f18015f;

    /* JADX INFO: renamed from: g */
    public final boolean f18016g;

    public ed1(String str, int i, long j, boolean z) {
        this.f18013d = str;
        this.f18014e = i;
        this.f18015f = j;
        this.f18016g = z;
    }

    /* JADX INFO: renamed from: b */
    public final long m5091b() {
        long j = this.f18015f;
        return j == -1 ? this.f18014e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ed1) {
            ed1 ed1Var = (ed1) obj;
            if (AbstractC1356y5.m12927u(this.f18013d, ed1Var.f18013d) && m5091b() == ed1Var.m5091b() && this.f18016g == ed1Var.f18016g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18013d, Long.valueOf(m5091b()), Boolean.valueOf(this.f18016g)});
    }

    public final String toString() {
        z32 z32VarM12903L = AbstractC1356y5.m12903L(this);
        z32VarM12903L.m13323p(this.f18013d, "name");
        z32VarM12903L.m13323p(Long.valueOf(m5091b()), "version");
        z32VarM12903L.m13323p(Boolean.valueOf(this.f18016g), "is_fully_rolled_out");
        return z32VarM12903L.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9088M(parcel, 1, this.f18013d);
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(this.f18014e);
        long jM5091b = m5091b();
        oh6.m9091P(parcel, 3, 8);
        parcel.writeLong(jM5091b);
        oh6.m9091P(parcel, 4, 4);
        parcel.writeInt(this.f18016g ? 1 : 0);
        oh6.m9094S(parcel, iM9092Q);
    }

    public ed1(String str, long j) {
        this(str, -1, j, false);
    }
}
