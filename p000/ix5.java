package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ix5 extends bv4 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f21870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix5(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 2);
        this.f21870c = b;
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: k */
    public final double mo3731k(long j, Object obj) {
        byte b = this.f21870c;
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
        byte b = this.f21870c;
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
        switch (this.f21870c) {
            case 0:
                if (!rx5.f29721e) {
                    rx5.m10488f(j, obj, z);
                } else {
                    rx5.m10487e(j, obj, z);
                }
                break;
            default:
                if (!rx5.f29721e) {
                    rx5.m10488f(j, obj, z);
                } else {
                    rx5.m10487e(j, obj, z);
                }
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: r */
    public final void mo3738r(Object obj, long j, double d) {
        switch (this.f21870c) {
            case 0:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: t */
    public final void mo3740t(Object obj, long j, float f) {
        byte b = this.f21870c;
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
    /* JADX INFO: renamed from: w */
    public final boolean mo3743w(long j, Object obj) {
        switch (this.f21870c) {
            case 0:
                return rx5.f29721e ? rx5.m10492j(j, obj) : rx5.m10493k(j, obj);
            default:
                return rx5.f29721e ? rx5.m10492j(j, obj) : rx5.m10493k(j, obj);
        }
    }
}
