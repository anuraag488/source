package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pz5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<pz5> CREATOR = new qo5((byte) 11);

    /* JADX INFO: renamed from: d */
    public final int f28109d;

    /* JADX INFO: renamed from: e */
    public final String f28110e;

    /* JADX INFO: renamed from: f */
    public final Intent f28111f;

    public pz5(int i, String str, Intent intent) {
        this.f28109d = i;
        this.f28110e = str;
        this.f28111f = intent;
    }

    /* JADX INFO: renamed from: a */
    public static pz5 m9692a(Activity activity) {
        return new pz5(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz5)) {
            return false;
        }
        pz5 pz5Var = (pz5) obj;
        return this.f28109d == pz5Var.f28109d && Objects.equals(this.f28110e, pz5Var.f28110e) && Objects.equals(this.f28111f, pz5Var.f28111f);
    }

    public final int hashCode() {
        return this.f28109d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f28109d);
        oh6.m9088M(parcel, 2, this.f28110e);
        oh6.m9087L(parcel, 3, this.f28111f, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
