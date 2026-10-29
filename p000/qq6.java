package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qq6 extends bv4 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f28703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq6(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 5);
        this.f28703c = b;
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: k */
    public final double mo3731k(long j, Object obj) {
        byte b = this.f28703c;
        Unsafe unsafe = this.f15653b;
        switch (b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: m */
    public final float mo3733m(long j, Object obj) {
        byte b = this.f28703c;
        Unsafe unsafe = this.f15653b;
        switch (b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: o */
    public final void mo3735o(long j, Object obj, boolean z) {
        switch (this.f28703c) {
            case 0:
                if (!rq6.f29540g) {
                    rq6.m10404d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    rq6.m10403c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!rq6.f29540g) {
                    rq6.m10404d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    rq6.m10403c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: q */
    public final void mo3737q(Object obj, long j, byte b) {
        switch (this.f28703c) {
            case 0:
                if (!rq6.f29540g) {
                    rq6.m10404d(obj, j, b);
                } else {
                    rq6.m10403c(obj, j, b);
                }
                break;
            default:
                if (!rq6.f29540g) {
                    rq6.m10404d(obj, j, b);
                } else {
                    rq6.m10403c(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: s */
    public final void mo3739s(Object obj, long j, double d) {
        switch (this.f28703c) {
            case 0:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: v */
    public final void mo3742v(Object obj, long j, float f) {
        byte b = this.f28703c;
        Unsafe unsafe = this.f15653b;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: y */
    public final boolean mo3745y(long j, Object obj) {
        switch (this.f28703c) {
            case 0:
                return rq6.f29540g ? rq6.m10410j(j, obj) : rq6.m10411k(j, obj);
            default:
                return rq6.f29540g ? rq6.m10410j(j, obj) : rq6.m10411k(j, obj);
        }
    }
}
