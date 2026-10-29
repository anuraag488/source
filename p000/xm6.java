package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xm6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<xm6> CREATOR = new qo5((byte) 28);

    /* JADX INFO: renamed from: d */
    public int f34427d;

    /* JADX INFO: renamed from: e */
    public String f34428e;

    /* JADX INFO: renamed from: f */
    public long f34429f;

    /* JADX INFO: renamed from: g */
    public Long f34430g;

    /* JADX INFO: renamed from: h */
    public String f34431h;

    /* JADX INFO: renamed from: i */
    public String f34432i;

    /* JADX INFO: renamed from: j */
    public Double f34433j;

    public xm6(long j, Object obj, String str, String str2) {
        y42.m12851X(str);
        this.f34427d = 2;
        this.f34428e = str;
        this.f34429f = j;
        this.f34432i = str2;
        if (obj == null) {
            this.f34430g = null;
            this.f34433j = null;
            this.f34431h = null;
            return;
        }
        if (obj instanceof Long) {
            this.f34430g = (Long) obj;
            this.f34433j = null;
            this.f34431h = null;
        } else if (obj instanceof String) {
            this.f34430g = null;
            this.f34433j = null;
            this.f34431h = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                C1077qn.m9987m("User attribute given of un-supported type");
                throw null;
            }
            this.f34430g = null;
            this.f34433j = (Double) obj;
            this.f34431h = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m12714f() {
        Long l = this.f34430g;
        if (l != null) {
            return l;
        }
        Double d = this.f34433j;
        if (d != null) {
            return d;
        }
        String str = this.f34431h;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qo5.m9997c(this, parcel);
    }

    public xm6(an6 an6Var) {
        this(an6Var.f14648d, an6Var.f14649e, an6Var.f14647c, an6Var.f14646b);
    }
}
