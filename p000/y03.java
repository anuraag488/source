package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y03 extends j13 {

    /* JADX INFO: renamed from: c */
    public mt2 f34761c;

    /* JADX INFO: renamed from: d */
    public hf0 f34762d;

    /* JADX INFO: renamed from: e */
    public po2 f34763e;

    /* JADX INFO: renamed from: f */
    public e13 f34764f;

    /* JADX INFO: renamed from: g */
    public ec3 f34765g;

    /* JADX INFO: renamed from: h */
    public boolean f34766h;

    /* JADX INFO: renamed from: i */
    public boolean f34767i;

    /* JADX INFO: renamed from: j */
    public boolean f34768j;

    /* JADX WARN: Code duplicated, block: B:137:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0336  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [uw2] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [uw2] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
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
    @Override // p000.j13
    /* JADX INFO: renamed from: a */
    public final boolean mo6992a(po2 po2Var, cf2 cf2Var, rd6 rd6Var, boolean z) {
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        ec3 ec3Var;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        hf0 hf0Var;
        int i4;
        hf0 hf0Var2 = this.f34762d;
        po2 po2Var2 = this.f34763e;
        boolean zMo6992a = super.mo6992a(po2Var, cf2Var, rd6Var, z);
        ?? M10644P = this.f34761c;
        if (M10644P.f25208n) {
            ?? uw2Var = 0;
            while (M10644P != 0) {
                if (M10644P instanceof oc3) {
                    this.f34764f = sc6.m10650V((oc3) M10644P, 16);
                } else if ((M10644P.f25197c & 16) != 0 && (M10644P instanceof qx0)) {
                    mt2 mt2Var = ((qx0) M10644P).f28863p;
                    int i5 = 0;
                    while (mt2Var != null) {
                        if ((mt2Var.f25197c & 16) != 0) {
                            i5++;
                            if (i5 == 1) {
                                M10644P = M10644P;
                                uw2Var = uw2Var;
                                uw2Var = uw2Var;
                                M10644P = mt2Var;
                            } else {
                                if (uw2Var == 0) {
                                    uw2Var = new uw2(new mt2[16]);
                                }
                                if (M10644P != 0) {
                                    uw2Var.m11663b(M10644P);
                                    M10644P = 0;
                                }
                                uw2Var.m11663b(mt2Var);
                            }
                        } else {
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                        }
                        mt2Var = mt2Var.f25200f;
                        M10644P = M10644P;
                        uw2Var = uw2Var;
                    }
                    if (i5 == 1) {
                        M10644P = M10644P;
                        uw2Var = uw2Var;
                    } else {
                        M10644P = M10644P;
                        uw2Var = uw2Var;
                    }
                }
                M10644P = sc6.m10644P(uw2Var);
            }
            if (this.f34764f != null) {
                int iM9594e = po2Var.m9594e();
                int i6 = 0;
                while (i6 < iM9594e) {
                    long jM9591b = po2Var.m9591b(i6);
                    lc3 lc3Var = (lc3) po2Var.m9595f(i6);
                    if (hf0Var2.m6375g(jM9591b)) {
                        long j = lc3Var.f23941g;
                        long j2 = lc3Var.f23937c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(lc3Var.m7953b().size());
                            List listM7953b = lc3Var.m7953b();
                            int size = listM7953b.size();
                            int i7 = 0;
                            while (i7 < size) {
                                int i8 = size;
                                mw1 mw1Var = (mw1) listM7953b.get(i7);
                                hf0 hf0Var3 = hf0Var2;
                                long j3 = mw1Var.f25253b;
                                if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    arrayList.add(new mw1(mw1Var.f25252a, this.f34764f.mo4006V(cf2Var, j3, true), mw1Var.f25254c, mw1Var.f25255d, mw1Var.f25256e));
                                }
                                i7++;
                                listM7953b = listM7953b;
                                size = i8;
                                hf0Var2 = hf0Var3;
                                lc3Var = lc3Var;
                                i6 = i6;
                            }
                            hf0Var = hf0Var2;
                            i4 = i6;
                            lc3 lc3Var2 = new lc3(lc3Var.f23935a, lc3Var.f23936b, this.f34764f.mo4006V(cf2Var, j2, true), lc3Var.f23938d, lc3Var.f23939e, lc3Var.f23940f, this.f34764f.mo4006V(cf2Var, j, true), lc3Var.f23942h, lc3Var.f23943i, arrayList, lc3Var.f23944j, lc3Var.f23945k, lc3Var.f23946l, lc3Var.f23948n);
                            lc3 lc3Var3 = lc3Var.f23951q;
                            if (lc3Var3 == null) {
                                lc3Var3 = lc3Var;
                            }
                            lc3Var2.f23951q = lc3Var3;
                            lc3 lc3Var4 = lc3Var.f23951q;
                            if (lc3Var4 != null) {
                                lc3Var = lc3Var4;
                            }
                            lc3Var2.f23951q = lc3Var;
                            po2Var2.m9592c(jM9591b, lc3Var2);
                        } else {
                            hf0Var = hf0Var2;
                            i4 = i6;
                        }
                    } else {
                        hf0Var = hf0Var2;
                        i4 = i6;
                    }
                    i6 = i4 + 1;
                    iM9594e = iM9594e;
                    zMo6992a = zMo6992a;
                    hf0Var2 = hf0Var;
                }
                hf0 hf0Var4 = hf0Var2;
                boolean z7 = zMo6992a;
                if (po2Var2.m9594e() == 0) {
                    hf0Var4.f20528b = 0;
                    this.f21953a.m11668g();
                    return true;
                }
                int i9 = hf0Var4.f20528b;
                while (true) {
                    i9--;
                    byte b = -1;
                    if (-1 >= i9) {
                        break;
                    }
                    long j4 = ((long[]) hf0Var4.f20529c)[i9];
                    if (po2Var.f27860a) {
                        int i10 = po2Var.f27863d;
                        long[] jArr = po2Var.f27861b;
                        Object[] objArr = po2Var.f27862c;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i10) {
                            Object obj2 = objArr[i11];
                            byte b2 = b;
                            if (obj2 != ks5.f23401j) {
                                if (i11 != i12) {
                                    jArr[i12] = jArr[i11];
                                    objArr[i12] = obj2;
                                    objArr[i11] = null;
                                }
                                i12++;
                            }
                            i11++;
                            b = b2;
                        }
                        po2Var.f27860a = false;
                        po2Var.f27863d = i12;
                    }
                    if (qq2.m10025i(po2Var.f27861b, po2Var.f27863d, j4) < 0 && i9 < (i3 = hf0Var4.f20528b)) {
                        int i13 = i3 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) hf0Var4.f20529c;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        hf0Var4.f20528b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(po2Var2.m9594e());
                int iM9594e2 = po2Var2.m9594e();
                for (int i16 = 0; i16 < iM9594e2; i16++) {
                    arrayList2.add(po2Var2.m9595f(i16));
                }
                ec3 ec3Var2 = new ec3(arrayList2, rd6Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    Object obj3 = arrayList2.get(i17);
                    if (rd6Var.m10302a(((lc3) obj3).f23935a)) {
                        obj = obj3;
                        break;
                    }
                    i17++;
                }
                lc3 lc3Var5 = (lc3) obj;
                if (lc3Var5 != null) {
                    boolean z8 = lc3Var5.f23938d;
                    if (z) {
                        z2 = false;
                        z5 = this.f34767i;
                        if (!z5 && (z8 || lc3Var5.f23942h)) {
                            long j5 = this.f34764f.f16901c;
                            long j6 = lc3Var5.f23937c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                            z3 = true;
                            z5 = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j5 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j5 & 4294967295L)))));
                            this.f34767i = z5;
                        }
                        z6 = this.f34766h;
                        if (z5 == z6 && ((i2 = ec3Var2.f18005f) == 3 || i2 == 4 || i2 == 5)) {
                            ec3Var2.f18005f = z5 ? 4 : 5;
                        } else {
                            i = ec3Var2.f18005f;
                            if (i != 4 && z6 && !this.f34768j) {
                                ec3Var2.f18005f = 3;
                            } else if (i == 5 && z5 && z8) {
                                ec3Var2.f18005f = 3;
                            }
                        }
                    } else {
                        z2 = false;
                        this.f34767i = false;
                        z5 = false;
                    }
                    z3 = true;
                    z6 = this.f34766h;
                    if (z5 == z6) {
                        i = ec3Var2.f18005f;
                        if (i != 4) {
                            if (i == 5) {
                                ec3Var2.f18005f = 3;
                            }
                        } else if (i == 5) {
                            ec3Var2.f18005f = 3;
                        }
                    } else {
                        i = ec3Var2.f18005f;
                        if (i != 4) {
                            if (i == 5) {
                                ec3Var2.f18005f = 3;
                            }
                        } else if (i == 5) {
                            ec3Var2.f18005f = 3;
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z7 && ec3Var2.f18005f == 3 && (ec3Var = this.f34765g) != null) {
                    ?? r1 = ec3Var.f18000a;
                    int size3 = r1.size();
                    ?? r4 = ec3Var2.f18000a;
                    if (size3 != r4.size()) {
                        z4 = z3;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z4 = z2;
                            break;
                        }
                        if (!b33.m3425c(((lc3) r1.get(r5)).f23937c, ((lc3) r4.get(r5)).f23937c)) {
                            z4 = z3;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z4 = z3;
                    break;
                }
                this.f34765g = ec3Var2;
                return z4;
            }
        }
        return true;
    }

    @Override // p000.j13
    /* JADX INFO: renamed from: b */
    public final void mo6993b(rd6 rd6Var) {
        super.mo6993b(rd6Var);
        ec3 ec3Var = this.f34765g;
        if (ec3Var == null) {
            return;
        }
        this.f34766h = this.f34767i;
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lc3 lc3Var = (lc3) list.get(i);
            boolean z = lc3Var.f23938d;
            long j = lc3Var.f23935a;
            boolean zM10302a = rd6Var.m10302a(j);
            boolean z2 = this.f34767i;
            if ((!z && !zM10302a) || (!z && !z2)) {
                this.f34762d.m6382p(j);
            }
        }
        this.f34767i = false;
        this.f34768j = ec3Var.f18005f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [uw2] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [uw2] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [mt2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [mt2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: c */
    public final void m12808c() {
        uw2 uw2Var = this.f21953a;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            ((y03) objArr[i2]).m12808c();
        }
        ?? M10644P = this.f34761c;
        ?? uw2Var2 = 0;
        while (M10644P != 0) {
            if (M10644P instanceof oc3) {
                ((oc3) M10644P).mo8143j0();
            } else if ((M10644P.f25197c & 16) != 0 && (M10644P instanceof qx0)) {
                mt2 mt2Var = ((qx0) M10644P).f28863p;
                int i3 = 0;
                uw2Var2 = uw2Var2;
                M10644P = M10644P;
                while (mt2Var != null) {
                    if ((mt2Var.f25197c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            uw2Var2 = uw2Var2;
                            M10644P = mt2Var;
                        } else {
                            if (uw2Var2 == 0) {
                                uw2Var2 = new uw2(new mt2[16]);
                            }
                            if (M10644P != 0) {
                                uw2Var2.m11663b(M10644P);
                                M10644P = 0;
                            }
                            uw2Var2.m11663b(mt2Var);
                        }
                    }
                    mt2Var = mt2Var.f25200f;
                    uw2Var2 = uw2Var2;
                    M10644P = M10644P;
                }
                if (i3 == 1) {
                }
            }
            M10644P = sc6.m10644P(uw2Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: d */
    public final boolean m12809d(rd6 rd6Var) {
        boolean z;
        wf2 wf2Var;
        mt2 mt2Var = this.f34761c;
        po2 po2Var = this.f34763e;
        if (po2Var.m9594e() != 0 && mt2Var.f25208n) {
            e13 e13Var = mt2Var.f25202h;
            if ((e13Var == null || (wf2Var = e13Var.f17625u) == null) ? false : wf2Var.m12257K()) {
                ec3 ec3Var = this.f34765g;
                long j = this.f34764f.f16901c;
                ?? M10644P = mt2Var;
                ?? uw2Var = 0;
                while (true) {
                    z = true;
                    if (M10644P == 0) {
                        break;
                    }
                    if (M10644P instanceof oc3) {
                        ((oc3) M10644P).mo6964N(ec3Var, fc3.f18905c, j);
                    } else if ((M10644P.f25197c & 16) != 0 && (M10644P instanceof qx0)) {
                        mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                        int i = 0;
                        while (mt2Var2 != null) {
                            if ((mt2Var2.f25197c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                    uw2Var = uw2Var;
                                    M10644P = mt2Var2;
                                } else {
                                    if (uw2Var == 0) {
                                        uw2Var = new uw2(new mt2[16]);
                                    }
                                    if (M10644P != 0) {
                                        uw2Var.m11663b(M10644P);
                                        M10644P = 0;
                                    }
                                    uw2Var.m11663b(mt2Var2);
                                }
                            } else {
                                M10644P = M10644P;
                                uw2Var = uw2Var;
                            }
                            mt2Var2 = mt2Var2.f25200f;
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                        }
                        if (i == 1) {
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                        } else {
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                        }
                    }
                    M10644P = sc6.m10644P(uw2Var);
                }
                if (mt2Var.f25208n) {
                    uw2 uw2Var2 = this.f21953a;
                    Object[] objArr = uw2Var2.f32211a;
                    int i2 = uw2Var2.f32213c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((y03) objArr[i3]).m12809d(rd6Var);
                    }
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        mo6993b(rd6Var);
        int i4 = po2Var.f27863d;
        Object[] objArr2 = po2Var.f27862c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        po2Var.f27863d = 0;
        po2Var.f27860a = false;
        this.f34764f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mt2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [mt2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [uw2] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [uw2] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [uw2] */
    /* JADX INFO: renamed from: e */
    public final boolean m12810e(rd6 rd6Var, boolean z) {
        wf2 wf2Var;
        ?? M10644P = this.f34761c;
        if (this.f34763e.m9594e() != 0 && M10644P.f25208n) {
            e13 e13Var = M10644P.f25202h;
            if ((e13Var == null || (wf2Var = e13Var.f17625u) == null) ? false : wf2Var.m12257K()) {
                ec3 ec3Var = this.f34765g;
                long j = this.f34764f.f16901c;
                ?? M10644P2 = M10644P;
                ?? uw2Var = 0;
                while (M10644P2 != 0) {
                    if (M10644P2 instanceof oc3) {
                        ((oc3) M10644P2).mo6964N(ec3Var, fc3.f18903a, j);
                    } else if ((M10644P2.f25197c & 16) != 0 && (M10644P2 instanceof qx0)) {
                        mt2 mt2Var = ((qx0) M10644P2).f28863p;
                        int i = 0;
                        while (mt2Var != null) {
                            if ((mt2Var.f25197c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    M10644P2 = M10644P2;
                                    uw2Var = uw2Var;
                                    uw2Var = uw2Var;
                                    M10644P2 = mt2Var;
                                } else {
                                    if (uw2Var == 0) {
                                        uw2Var = new uw2(new mt2[16]);
                                    }
                                    if (M10644P2 != 0) {
                                        uw2Var.m11663b(M10644P2);
                                        M10644P2 = 0;
                                    }
                                    uw2Var.m11663b(mt2Var);
                                }
                            } else {
                                M10644P2 = M10644P2;
                                uw2Var = uw2Var;
                            }
                            mt2Var = mt2Var.f25200f;
                            M10644P2 = M10644P2;
                            uw2Var = uw2Var;
                        }
                        if (i == 1) {
                            M10644P2 = M10644P2;
                            uw2Var = uw2Var;
                        } else {
                            M10644P2 = M10644P2;
                            uw2Var = uw2Var;
                        }
                    }
                    M10644P2 = sc6.m10644P(uw2Var);
                }
                if (M10644P.f25208n) {
                    uw2 uw2Var2 = this.f21953a;
                    Object[] objArr = uw2Var2.f32211a;
                    int i2 = uw2Var2.f32213c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((y03) objArr[i3]).m12810e(rd6Var, z);
                    }
                }
                if (M10644P.f25208n) {
                    ?? uw2Var3 = 0;
                    while (M10644P != 0) {
                        if (M10644P instanceof oc3) {
                            ((oc3) M10644P).mo6964N(ec3Var, fc3.f18904b, j);
                        } else if ((M10644P.f25197c & 16) != 0 && (M10644P instanceof qx0)) {
                            mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                            int i4 = 0;
                            while (mt2Var2 != null) {
                                if ((mt2Var2.f25197c & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        M10644P = M10644P;
                                        uw2Var3 = uw2Var3;
                                        uw2Var3 = uw2Var3;
                                        M10644P = mt2Var2;
                                    } else {
                                        if (uw2Var3 == 0) {
                                            uw2Var3 = new uw2(new mt2[16]);
                                        }
                                        if (M10644P != 0) {
                                            uw2Var3.m11663b(M10644P);
                                            M10644P = 0;
                                        }
                                        uw2Var3.m11663b(mt2Var2);
                                    }
                                } else {
                                    M10644P = M10644P;
                                    uw2Var3 = uw2Var3;
                                }
                                mt2Var2 = mt2Var2.f25200f;
                                M10644P = M10644P;
                                uw2Var3 = uw2Var3;
                            }
                            if (i4 == 1) {
                                M10644P = M10644P;
                                uw2Var3 = uw2Var3;
                            } else {
                                M10644P = M10644P;
                                uw2Var3 = uw2Var3;
                            }
                        }
                        M10644P = sc6.m10644P(uw2Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m12811f(long j, cw2 cw2Var) {
        hf0 hf0Var = this.f34762d;
        if (hf0Var.m6375g(j) && !cw2Var.m4204e(this)) {
            hf0Var.m6382p(j);
            this.f34763e.m9593d(j);
        }
        uw2 uw2Var = this.f21953a;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            ((y03) objArr[i2]).m12811f(j, cw2Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f34761c + ", children=" + this.f21953a + ", pointerIds=" + this.f34762d + ")";
    }
}
