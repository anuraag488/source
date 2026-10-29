package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d16 extends AbstractC0894m2 {
    public static final Parcelable.Creator<d16> CREATOR = new qo5(16);

    /* JADX INFO: renamed from: d */
    public int f16732d;

    /* JADX INFO: renamed from: e */
    public String f16733e;

    /* JADX INFO: renamed from: f */
    public String f16734f;

    /* JADX INFO: renamed from: g */
    public String f16735g;

    /* JADX INFO: renamed from: h */
    public d36 f16736h;

    /* JADX INFO: renamed from: i */
    public d16 f16737i;

    static {
        Process.myUid();
        Process.myPid();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d16)) {
            return false;
        }
        d16 d16Var = (d16) obj;
        return this.f16732d == d16Var.f16732d && z62.m13387o(this.f16733e, d16Var.f16733e) && z62.m13387o(this.f16734f, d16Var.f16734f) && z62.m13387o(this.f16735g, d16Var.f16735g) && z62.m13387o(this.f16737i, d16Var.f16737i) && z62.m13387o(this.f16736h, d16Var.f16736h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16732d), this.f16733e, this.f16734f, this.f16735g, this.f16737i});
    }

    public final String toString() {
        String str = this.f16735g;
        String str2 = this.f16733e;
        int length = str2.length() + 18;
        String str3 = this.f16734f;
        StringBuilder sb = new StringBuilder(length + (str3 != null ? str3.length() : 0));
        sb.append(this.f16732d);
        sb.append("/");
        sb.append(str2);
        if (str3 != null) {
            sb.append("[");
            if (od4.m9043X(str3, str2, false)) {
                sb.append((CharSequence) str3, str2.length(), str3.length());
            } else {
                sb.append(str3);
            }
            sb.append("]");
        }
        if (str != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f16732d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        oh6.m9088M(parcel, 3, this.f16733e);
        oh6.m9088M(parcel, 4, this.f16734f);
        oh6.m9088M(parcel, 6, this.f16735g);
        oh6.m9087L(parcel, 7, this.f16737i, i);
        oh6.m9090O(parcel, 8, this.f16736h);
        oh6.m9094S(parcel, iM9092Q);
    }
}
