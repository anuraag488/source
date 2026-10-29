package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d83 extends ic4 implements Parcelable, p94 {
    public static final Parcelable.Creator<d83> CREATOR = new c83(0);

    /* JADX INFO: renamed from: b */
    public final r94 f16858b;

    /* JADX INFO: renamed from: c */
    public q94 f16859c;

    public d83(Object obj, r94 r94Var) {
        this.f16858b = r94Var;
        e94 e94VarM7451h = k94.m7451h();
        q94 q94Var = new q94(e94VarM7451h.mo5015g(), obj);
        if (!(e94VarM7451h instanceof rs1)) {
            q94Var.f22165b = new q94(1L, obj);
        }
        this.f16859c = q94Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f16859c;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo129b(jc4 jc4Var, jc4 jc4Var2, jc4 jc4Var3) {
        if (this.f16858b.mo6713d(((q94) jc4Var2).f28329c, ((q94) jc4Var3).f28329c)) {
            return jc4Var2;
        }
        return null;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        this.f16859c = (q94) jc4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.p94
    /* JADX INFO: renamed from: e */
    public final r94 mo131e() {
        return this.f16858b;
    }

    @Override // p000.xb4
    public final Object getValue() {
        return ((q94) k94.m7462s(this.f16859c, this)).f28329c;
    }

    @Override // p000.sw2
    public final void setValue(Object obj) {
        e94 e94VarM7451h;
        q94 q94Var = (q94) k94.m7449f(this.f16859c);
        if (this.f16858b.mo6713d(q94Var.f28329c, obj)) {
            return;
        }
        q94 q94Var2 = this.f16859c;
        synchronized (k94.f23012c) {
            e94VarM7451h = k94.m7451h();
            ((q94) k94.m7457n(q94Var2, this, e94VarM7451h, q94Var)).f28329c = obj;
        }
        k94.m7455l(e94VarM7451h, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((q94) k94.m7449f(this.f16859c)).f28329c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        o85 o85Var = o85.f26450j;
        r94 r94Var = this.f16858b;
        if (r94Var.equals(o85Var)) {
            i2 = 0;
        } else if (r94Var.equals(ia5.f21230u)) {
            i2 = 1;
        } else {
            if (!r94Var.equals(o85.f26454n)) {
                C1077qn.m9989o("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
