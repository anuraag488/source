package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z73 extends ic4 implements Parcelable, p94, xb4, sw2 {
    public static final Parcelable.Creator<z73> CREATOR = new C1280w4(10);

    /* JADX INFO: renamed from: b */
    public m94 f35805b;

    public z73(float f) {
        e94 e94VarM7451h = k94.m7451h();
        m94 m94Var = new m94(e94VarM7451h.mo5015g(), f);
        if (!(e94VarM7451h instanceof rs1)) {
            m94Var.f22165b = new m94(1L, f);
        }
        this.f35805b = m94Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f35805b;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo129b(jc4 jc4Var, jc4 jc4Var2, jc4 jc4Var3) {
        if (((m94) jc4Var2).f24771c == ((m94) jc4Var3).f24771c) {
            return jc4Var2;
        }
        return null;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        this.f35805b = (m94) jc4Var;
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
        return Float.valueOf(m13399h());
    }

    /* JADX INFO: renamed from: h */
    public final float m13399h() {
        return ((m94) k94.m7462s(this.f35805b, this)).f24771c;
    }

    /* JADX INFO: renamed from: i */
    public final void m13400i(float f) {
        e94 e94VarM7451h;
        m94 m94Var = (m94) k94.m7449f(this.f35805b);
        if (m94Var.f24771c == f) {
            return;
        }
        m94 m94Var2 = this.f35805b;
        synchronized (k94.f23012c) {
            e94VarM7451h = k94.m7451h();
            ((m94) k94.m7457n(m94Var2, this, e94VarM7451h, m94Var)).f24771c = f;
        }
        k94.m7455l(e94VarM7451h, this);
    }

    @Override // p000.sw2
    public final void setValue(Object obj) {
        m13400i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((m94) k94.m7449f(this.f35805b)).f24771c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m13399h());
    }
}
