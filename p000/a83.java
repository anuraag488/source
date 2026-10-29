package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a83 extends ic4 implements Parcelable, p94, xb4, sw2 {
    public static final Parcelable.Creator<a83> CREATOR = new C1280w4((byte) 11);

    /* JADX INFO: renamed from: b */
    public n94 f164b;

    public a83(int i) {
        e94 e94VarM7451h = k94.m7451h();
        n94 n94Var = new n94(i, e94VarM7451h.mo5015g());
        if (!(e94VarM7451h instanceof rs1)) {
            n94Var.f22165b = new n94(i, 1L);
        }
        this.f164b = n94Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f164b;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo129b(jc4 jc4Var, jc4 jc4Var2, jc4 jc4Var3) {
        if (((n94) jc4Var2).f25579c == ((n94) jc4Var3).f25579c) {
            return jc4Var2;
        }
        return null;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        this.f164b = (n94) jc4Var;
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
        return Integer.valueOf(m132h());
    }

    /* JADX INFO: renamed from: h */
    public final int m132h() {
        return ((n94) k94.m7462s(this.f164b, this)).f25579c;
    }

    /* JADX INFO: renamed from: i */
    public final void m133i(int i) {
        e94 e94VarM7451h;
        n94 n94Var = (n94) k94.m7449f(this.f164b);
        if (n94Var.f25579c != i) {
            n94 n94Var2 = this.f164b;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                ((n94) k94.m7457n(n94Var2, this, e94VarM7451h, n94Var)).f25579c = i;
            }
            k94.m7455l(e94VarM7451h, this);
        }
    }

    @Override // p000.sw2
    public final void setValue(Object obj) {
        m133i(((Number) obj).intValue());
    }

    public final String toString() {
        return zi4.m13618r(((n94) k94.m7449f(this.f164b)).f25579c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(m132h());
    }
}
