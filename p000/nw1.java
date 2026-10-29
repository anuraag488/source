package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 {

    /* JADX INFO: renamed from: a */
    public cf2 f26143a;

    /* JADX INFO: renamed from: b */
    public boolean f26144b;

    /* JADX INFO: renamed from: c */
    public boolean f26145c;

    /* JADX INFO: renamed from: d */
    public boolean f26146d;

    /* JADX INFO: renamed from: e */
    public boolean f26147e;

    /* JADX INFO: renamed from: f */
    public cw2 f26148f;

    /* JADX INFO: renamed from: g */
    public j13 f26149g;

    /* JADX INFO: renamed from: h */
    public sv2 f26150h;

    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX INFO: renamed from: a */
    public final void m8867a(long j, List list, boolean z) {
        long[] jArr;
        y03 y03Var;
        Object objM10924d;
        Object obj;
        sv2 sv2Var = this.f26150h;
        j13 j13Var = this.f26149g;
        int size = list.size();
        j13 j13Var2 = j13Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            byte b = 2;
            if (i >= size) {
                break;
            }
            mt2 mt2Var = (mt2) list.get(i);
            if (mt2Var.f25208n) {
                jp1 jp1Var = new jp1(b);
                jp1Var.f22485b = this;
                jp1Var.f22486c = mt2Var;
                VarHandle.storeStoreFence();
                mt2Var.f25207m = jp1Var;
                if (z2) {
                    uw2 uw2Var = j13Var2.f21953a;
                    Object[] objArr = uw2Var.f32211a;
                    int i2 = uw2Var.f32213c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (z62.m13387o(((y03) obj).f34761c, mt2Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    y03Var = (y03) obj;
                    if (y03Var != null) {
                        y03Var.f34767i = true;
                        y03Var.f34762d.m6373e(j);
                        if (z) {
                            Object objM10924d2 = sv2Var.m10924d(j);
                            if (objM10924d2 == null) {
                                objM10924d2 = new cw2();
                                sv2Var.m10927g(j, objM10924d2);
                            }
                            ((cw2) objM10924d2).m4200a(y03Var);
                        }
                    } else {
                        z2 = false;
                        y03Var = new y03();
                        y03Var.f34761c = mt2Var;
                        hf0 hf0Var = new hf0((byte) 4);
                        hf0Var.f20529c = new long[2];
                        y03Var.f34762d = hf0Var;
                        y03Var.f34763e = new po2(2);
                        y03Var.f34767i = true;
                        y03Var.f34768j = true;
                        VarHandle.storeStoreFence();
                        hf0Var.m6373e(j);
                        if (z) {
                            objM10924d = sv2Var.m10924d(j);
                            if (objM10924d == null) {
                                objM10924d = new cw2();
                                sv2Var.m10927g(j, objM10924d);
                            }
                            ((cw2) objM10924d).m4200a(y03Var);
                        }
                        j13Var2.f21953a.m11663b(y03Var);
                    }
                } else {
                    y03Var = new y03();
                    y03Var.f34761c = mt2Var;
                    hf0 hf0Var2 = new hf0((byte) 4);
                    hf0Var2.f20529c = new long[2];
                    y03Var.f34762d = hf0Var2;
                    y03Var.f34763e = new po2(2);
                    y03Var.f34767i = true;
                    y03Var.f34768j = true;
                    VarHandle.storeStoreFence();
                    hf0Var2.m6373e(j);
                    if (z) {
                        objM10924d = sv2Var.m10924d(j);
                        if (objM10924d == null) {
                            objM10924d = new cw2();
                            sv2Var.m10927g(j, objM10924d);
                        }
                        ((cw2) objM10924d).m4200a(y03Var);
                    }
                    j13Var2.f21953a.m11663b(y03Var);
                }
                j13Var2 = y03Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = sv2Var.f30590b;
            Object[] objArr2 = sv2Var.f30591c;
            long[] jArr3 = sv2Var.f30589a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                cw2 cw2Var = (cw2) objArr2[i8];
                                uw2 uw2Var2 = j13Var.f21953a;
                                Object[] objArr3 = uw2Var2.f32211a;
                                int i9 = uw2Var2.f32213c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((y03) objArr3[i10]).m12811f(j3, cw2Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        sv2Var.m10921a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8868b(rd6 rd6Var, boolean z) {
        cw2 cw2Var = this.f26148f;
        j13 j13Var = this.f26149g;
        boolean zMo6992a = j13Var.mo6992a((po2) rd6Var.f29197c, this.f26143a, rd6Var, z);
        uw2 uw2Var = j13Var.f21953a;
        if (!zMo6992a) {
            return false;
        }
        boolean z2 = true;
        this.f26144b = true;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((y03) objArr[i2]).m12810e(rd6Var, z) || z3;
        }
        Object[] objArr2 = uw2Var.f32211a;
        int i3 = uw2Var.f32213c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((y03) objArr2[i4]).m12809d(rd6Var) || z4;
        }
        j13Var.mo6993b(rd6Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f26144b = false;
        if (this.f26147e) {
            this.f26147e = false;
            int i5 = cw2Var.f16533b;
            for (int i6 = 0; i6 < i5; i6++) {
                m8870d((mt2) cw2Var.m4206g(i6));
            }
            cw2Var.m4203d();
        }
        if (this.f26145c) {
            this.f26145c = false;
            m8869c();
        }
        if (this.f26146d) {
            this.f26146d = false;
            j13Var.f21953a.m11668g();
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m8869c() {
        j13 j13Var = this.f26149g;
        if (this.f26144b) {
            this.f26145c = true;
            return;
        }
        uw2 uw2Var = j13Var.f21953a;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            ((y03) objArr[i2]).m12808c();
        }
        if (this.f26146d) {
            this.f26146d = true;
        } else {
            j13Var.f21953a.m11668g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m8870d(mt2 mt2Var) {
        if (this.f26144b) {
            this.f26147e = true;
            this.f26148f.m4200a(mt2Var);
            return;
        }
        j13 j13Var = this.f26149g;
        cw2 cw2Var = j13Var.f21954b;
        cw2Var.m4203d();
        cw2Var.m4200a(j13Var);
        while (cw2Var.m4209j()) {
            j13 j13Var2 = (j13) cw2Var.m4211l(cw2Var.f16533b - 1);
            int i = 0;
            while (true) {
                uw2 uw2Var = j13Var2.f21953a;
                if (i < uw2Var.f32213c) {
                    y03 y03Var = (y03) uw2Var.f32211a[i];
                    if (z62.m13387o(y03Var.f34761c, mt2Var)) {
                        j13Var2.f21953a.m11671k(y03Var);
                        y03Var.m12808c();
                    } else {
                        cw2Var.m4200a(y03Var);
                        i++;
                    }
                }
            }
        }
    }
}
