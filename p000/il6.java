package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class il6 extends bv4 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f21543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il6(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 4);
        this.f21543c = b;
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: l */
    public final void mo3732l(Object obj, long j, byte b) {
        switch (this.f21543c) {
            case 0:
                if (!ml6.f25016g) {
                    ml6.m8348d(obj, j, b);
                } else {
                    ml6.m8347c(obj, j, b);
                }
                break;
            default:
                if (!ml6.f25016g) {
                    ml6.m8348d(obj, j, b);
                } else {
                    ml6.m8347c(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: n */
    public final boolean mo3734n(long j, Object obj) {
        switch (this.f21543c) {
            case 0:
                return ml6.f25016g ? ml6.m8355k(j, obj) : ml6.m8356l(j, obj);
            default:
                return ml6.f25016g ? ml6.m8355k(j, obj) : ml6.m8356l(j, obj);
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: o */
    public final void mo3735o(long j, Object obj, boolean z) {
        switch (this.f21543c) {
            case 0:
                if (!ml6.f25016g) {
                    ml6.m8348d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ml6.m8347c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!ml6.f25016g) {
                    ml6.m8348d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ml6.m8347c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: p */
    public final float mo3736p(long j, Object obj) {
        byte b = this.f21543c;
        Unsafe unsafe = this.f15653b;
        switch (b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: t */
    public final void mo3740t(Object obj, long j, float f) {
        byte b = this.f21543c;
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
    /* JADX INFO: renamed from: u */
    public final double mo3741u(long j, Object obj) {
        byte b = this.f21543c;
        Unsafe unsafe = this.f15653b;
        switch (b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: x */
    public final void mo3744x(Object obj, long j, double d) {
        switch (this.f21543c) {
            case 0:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
