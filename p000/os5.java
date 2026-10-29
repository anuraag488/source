package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class os5 extends AbstractC0894m2 implements Iterable {
    public static final Parcelable.Creator<os5> CREATOR = new qo5((byte) 6);

    /* JADX INFO: renamed from: d */
    public final Bundle f27065d;

    public os5(Bundle bundle) {
        this.f27065d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final Object m9258a(String str) {
        return this.f27065d.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final Double m9259b() {
        return Double.valueOf(this.f27065d.getDouble("value"));
    }

    /* JADX INFO: renamed from: c */
    public final String m9260c() {
        return this.f27065d.getString("currency");
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m9261d() {
        return new Bundle(this.f27065d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        js5 js5Var = new js5();
        js5Var.f22596a = this.f27065d.keySet().iterator();
        VarHandle.storeStoreFence();
        return js5Var;
    }

    public final String toString() {
        return this.f27065d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9084I(parcel, 2, m9261d());
        oh6.m9094S(parcel, iM9092Q);
    }
}
