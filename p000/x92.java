package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends ev0 {

    /* JADX INFO: renamed from: s */
    public final AbstractC0856l1 f34080s;

    public x92(AbstractC0856l1 abstractC0856l1) {
        this.f34080s = abstractC0856l1;
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: c */
    public final long mo5383c() {
        AbstractC0856l1 abstractC0856l1 = this.f34080s;
        String strM7804n = abstractC0856l1.m7804n();
        try {
            ws4 ws4VarM13373c0 = z62.m13373c0(strM7804n);
            if (ws4VarM13373c0 != null) {
                return ws4VarM13373c0.f33693a;
            }
            od4.m9040U(strM7804n);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Failed to parse type 'ULong' for input '", strM7804n), 0, 6);
            throw null;
        }
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: j */
    public final int mo6325j(g24 g24Var) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: s */
    public final int mo5396s() {
        AbstractC0856l1 abstractC0856l1 = this.f34080s;
        String strM7804n = abstractC0856l1.m7804n();
        try {
            rs4 rs4VarM13371b0 = z62.m13371b0(strM7804n);
            if (rs4VarM13371b0 != null) {
                return rs4VarM13371b0.f29588a;
            }
            od4.m9040U(strM7804n);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Failed to parse type 'UInt' for input '", strM7804n), 0, 6);
            throw null;
        }
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: w */
    public final byte mo5400w() {
        ms4 ms4Var;
        AbstractC0856l1 abstractC0856l1 = this.f34080s;
        String strM7804n = abstractC0856l1.m7804n();
        try {
            rs4 rs4VarM13371b0 = z62.m13371b0(strM7804n);
            if (rs4VarM13371b0 != null) {
                int i = rs4VarM13371b0.f29588a;
                if (Integer.compareUnsigned(i, 255) > 0) {
                    ms4Var = null;
                } else {
                    ms4Var = new ms4();
                    ms4Var.f25180a = (byte) i;
                    VarHandle.storeStoreFence();
                }
            } else {
                ms4Var = null;
            }
            if (ms4Var != null) {
                return ms4Var.f25180a;
            }
            od4.m9040U(strM7804n);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Failed to parse type 'UByte' for input '", strM7804n), 0, 6);
            throw null;
        }
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: z */
    public final short mo5403z() {
        bt4 bt4Var;
        AbstractC0856l1 abstractC0856l1 = this.f34080s;
        String strM7804n = abstractC0856l1.m7804n();
        try {
            rs4 rs4VarM13371b0 = z62.m13371b0(strM7804n);
            if (rs4VarM13371b0 != null) {
                int i = rs4VarM13371b0.f29588a;
                if (Integer.compareUnsigned(i, 65535) > 0) {
                    bt4Var = null;
                } else {
                    bt4Var = new bt4();
                    bt4Var.f15594a = (short) i;
                    VarHandle.storeStoreFence();
                }
            } else {
                bt4Var = null;
            }
            if (bt4Var != null) {
                return bt4Var.f15594a;
            }
            od4.m9040U(strM7804n);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Failed to parse type 'UShort' for input '", strM7804n), 0, 6);
            throw null;
        }
    }
}
