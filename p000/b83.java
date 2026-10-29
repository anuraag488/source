package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b83 extends ic4 implements Parcelable, p94, xb4, sw2 {
    public static final Parcelable.Creator<b83> CREATOR = new C1280w4((byte) 12);

    /* JADX INFO: renamed from: b */
    public o94 f15155b;

    public b83(long j) {
        e94 e94VarM7451h = k94.m7451h();
        o94 o94Var = new o94(e94VarM7451h.mo5015g(), j);
        if (!(e94VarM7451h instanceof rs1)) {
            o94Var.f22165b = new o94(1L, j);
        }
        this.f15155b = o94Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f15155b;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo129b(jc4 jc4Var, jc4 jc4Var2, jc4 jc4Var3) {
        if (((o94) jc4Var2).f26494c == ((o94) jc4Var3).f26494c) {
            return jc4Var2;
        }
        return null;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        this.f15155b = (o94) jc4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.p94
    /* JADX INFO: renamed from: e */
    public final r94 mo131e() {
        return ia5.f21230u;
    }

    @Override // p000.xb4
    public final Object getValue() {
        return Long.valueOf(m3512h());
    }

    /* JADX INFO: renamed from: h */
    public final long m3512h() {
        return ((o94) k94.m7462s(this.f15155b, this)).f26494c;
    }

    /* JADX INFO: renamed from: i */
    public final void m3513i(long j) {
        e94 e94VarM7451h;
        o94 o94Var = (o94) k94.m7449f(this.f15155b);
        if (o94Var.f26494c != j) {
            o94 o94Var2 = this.f15155b;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                ((o94) k94.m7457n(o94Var2, this, e94VarM7451h, o94Var)).f26494c = j;
            }
            k94.m7455l(e94VarM7451h, this);
        }
    }

    @Override // p000.sw2
    public final void setValue(Object obj) {
        m3513i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((o94) k94.m7449f(this.f15155b)).f26494c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m3512h());
    }
}
