package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 implements xq2 {

    /* JADX INFO: renamed from: a */
    public dk1 f32879a;

    @Override // p000.xq2
    /* JADX INFO: renamed from: a */
    public final int mo6053a(s62 s62Var, List list, int i) {
        dk1 dk1Var = this.f32879a;
        ArrayList arrayListM12940H = y62.m12940H(s62Var);
        float f = dk1Var.f17115c;
        bk1 bk1Var = dk1Var.f17118f;
        List list2 = (List) hb0.m6302N0(arrayListM12940H, 1);
        sq2 sq2Var = list2 != null ? (sq2) hb0.m6301M0(list2) : null;
        List list3 = (List) hb0.m6302N0(arrayListM12940H, 2);
        bk1Var.m3612b(sq2Var, list3 != null ? (sq2) hb0.m6301M0(list3) : null, ll0.m8010b(0, i, 0, 0, 13));
        List list4 = (List) hb0.m6301M0(arrayListM12940H);
        if (list4 == null) {
            list4 = v71.f32439a;
        }
        return dk1Var.m4519a(list4, i, s62Var.mo3579U(f), s62Var.mo3579U(dk1Var.f17117e), dk1Var.f17118f);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        dk1 dk1Var = this.f32879a;
        ArrayList arrayListM12940H = y62.m12940H(s62Var);
        float f = dk1Var.f17115c;
        bk1 bk1Var = dk1Var.f17118f;
        List list2 = (List) hb0.m6302N0(arrayListM12940H, 1);
        sq2 sq2Var = list2 != null ? (sq2) hb0.m6301M0(list2) : null;
        List list3 = (List) hb0.m6302N0(arrayListM12940H, 2);
        bk1Var.m3612b(sq2Var, list3 != null ? (sq2) hb0.m6301M0(list3) : null, ll0.m8010b(0, 0, 0, i, 7));
        List list4 = (List) hb0.m6301M0(arrayListM12940H);
        if (list4 == null) {
            list4 = v71.f32439a;
        }
        int iMo3579U = s62Var.mo3579U(f);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMo5824Z = ((sq2) list4.get(i2)).mo5824Z(i) + iMo3579U;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMo5824Z) - iMo3579U);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iMo5824Z;
            }
            i2 = i5;
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu2) && z62.m13387o(this.f32879a, ((vu2) obj).f32879a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        q50 q50Var;
        sq2 sq2Var;
        j52 j52VarM7021a;
        db3 db3Var;
        yj1 yj1Var;
        xj1 xj1VarM13642a;
        char c;
        j52 j52VarM7021a2;
        db3 db3VarMo5826e;
        yj1 yj1Var2;
        kv2 kv2Var;
        long jM7022b;
        int i;
        int i2;
        long jM7022b2;
        db3 db3VarMo5826e2;
        dk1 dk1Var = this.f32879a;
        ArrayList arrayListM12940H = y62.m12940H(zq2Var);
        dk1Var.getClass();
        bk1 bk1Var = dk1Var.f17118f;
        boolean zIsEmpty = arrayListM12940H.isEmpty();
        Map map = w71.f33134a;
        if (zIsEmpty || (kl0.m7538h(j) == 0 && bk1Var.f15348a != zj1.f36146a)) {
            return zq2Var.mo3583l0(0, 0, map, new dh0((byte) 27));
        }
        List list2 = (List) hb0.m6299K0(arrayListM12940H);
        if (list2.isEmpty()) {
            return zq2Var.mo3583l0(0, 0, map, new dh0((byte) 28));
        }
        List list3 = (List) hb0.m6302N0(arrayListM12940H, 1);
        sq2 sq2Var2 = list3 != null ? (sq2) hb0.m6301M0(list3) : null;
        List list4 = (List) hb0.m6302N0(arrayListM12940H, 2);
        sq2 sq2Var3 = list4 != null ? (sq2) hb0.m6301M0(list4) : null;
        list2.size();
        bk1Var.getClass();
        kg2 kg2Var = kg2.f23106a;
        long jM5529I = C0638f5.m5529I(C0638f5.m5538i(10, C0638f5.m5537h(j, kg2Var)), kg2Var);
        if (sq2Var2 != null) {
            ak1 ak1Var = new ak1((byte) 0);
            ak1Var.f14582b = bk1Var;
            ak1Var.f14583c = dk1Var;
            VarHandle.storeStoreFence();
            ks5.m7595A(sq2Var2, dk1Var, jM5529I, ak1Var);
            bk1Var.f15349b = sq2Var2;
        }
        if (sq2Var3 != null) {
            ak1 ak1Var2 = new ak1((byte) 1);
            ak1Var2.f14582b = bk1Var;
            ak1Var2.f14583c = dk1Var;
            VarHandle.storeStoreFence();
            ks5.m7595A(sq2Var3, dk1Var, jM5529I, ak1Var2);
            bk1Var.f15351d = sq2Var3;
        }
        Iterator it = list2.iterator();
        float f = dk1Var.f17115c;
        float f2 = dk1Var.f17117e;
        long jM5537h = C0638f5.m5537h(j, kg2Var);
        bk1 bk1Var2 = dk1Var.f17118f;
        uw2 uw2Var = new uw2(new yq2[16]);
        int iM7539i = kl0.m7539i(jM5537h);
        int iM7541k = kl0.m7541k(jM5537h);
        int iM7538h = kl0.m7538h(jM5537h);
        lv2 lv2Var = n52.f25469a;
        lv2 lv2Var2 = new lv2();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(zq2Var.mo3575E(f));
        int iCeil2 = (int) Math.ceil(zq2Var.mo3575E(f2));
        long jM8009a = ll0.m8009a(0, iM7539i, 0, iM7538h);
        long jM5529I2 = C0638f5.m5529I(C0638f5.m5538i(14, jM8009a), kg2Var);
        if (it instanceof vm0) {
            zq2Var.mo3586w0(iM7539i);
            zq2Var.mo3586w0(iM7538h);
            q50Var = new q50((byte) 8);
        } else {
            q50Var = null;
        }
        if (it.hasNext()) {
            try {
                if (it instanceof vm0) {
                    throw new ClassCastException();
                }
                sq2Var = (sq2) it.next();
            } catch (IndexOutOfBoundsException unused) {
                sq2Var = null;
            }
        } else {
            sq2Var = null;
        }
        if (sq2Var != null) {
            if (y70.m13044y(y70.m13043x(sq2Var)) == 0.0f) {
                y70.m13043x(sq2Var);
                db3VarMo5826e2 = sq2Var.mo5826e(jM5529I2);
                jM7022b2 = j52.m7022b(db3VarMo5826e2.mo4421j0(), db3VarMo5826e2.mo4420i0());
            } else {
                int iMo5823W = sq2Var.mo5823W(Integer.MAX_VALUE);
                jM7022b2 = j52.m7022b(iMo5823W, sq2Var.mo5825b0(iMo5823W));
                db3VarMo5826e2 = null;
            }
            j52VarM7021a = j52.m7021a(jM7022b2);
            db3Var = db3VarMo5826e2;
        } else {
            jM8009a = jM8009a;
            j52VarM7021a = null;
            db3Var = null;
        }
        db3 db3Var2 = db3Var;
        Integer numValueOf = j52VarM7021a != null ? Integer.valueOf((int) (j52VarM7021a.f22027a >> 32)) : null;
        Integer numValueOf2 = j52VarM7021a != null ? Integer.valueOf((int) (j52VarM7021a.f22027a & 4294967295L)) : null;
        kv2 kv2Var2 = new kv2();
        kv2 kv2Var3 = new kv2();
        sq2 sq2Var4 = sq2Var;
        mv2 mv2Var = new mv2();
        C1411zn c1411zn = new C1411zn(bk1Var2, jM5537h, iCeil, iCeil2);
        int i3 = iCeil;
        j52 j52Var = j52VarM7021a;
        yj1 yj1VarM13643b = c1411zn.m13643b(it.hasNext(), 0, j52.m7022b(iM7539i, iM7538h), j52Var, 0, 0, 0, false, false);
        Integer num = numValueOf2;
        if (yj1VarM13643b.f35264b) {
            yj1Var = yj1VarM13643b;
            xj1VarM13642a = c1411zn.m13642a(yj1Var, j52Var != null, -1, 0, iM7539i, 0);
        } else {
            yj1Var = yj1VarM13643b;
            xj1VarM13642a = null;
        }
        xj1 xj1Var = xj1VarM13642a;
        yj1 yj1Var3 = yj1Var;
        q50 q50Var2 = q50Var;
        int i4 = iM7541k;
        db3 db3Var3 = db3Var2;
        int i5 = iM7539i;
        int i6 = iM7538h;
        mv2 mv2Var2 = mv2Var;
        sq2 sq2Var5 = sq2Var4;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (!yj1Var3.f35264b && sq2Var5 != null) {
            int iIntValue = numValueOf.intValue();
            kv2 kv2Var4 = kv2Var2;
            int i13 = i9 + iIntValue;
            int iMax = Math.max(i7, num.intValue());
            int i14 = i5 - iIntValue;
            int i15 = i8 + 1;
            bk1Var2.getClass();
            arrayList.add(sq2Var5);
            lv2Var2.m8121h(i8, db3Var3);
            sq2Var5.mo4423m();
            int i16 = i15 - i10;
            boolean z = i16 < Integer.MAX_VALUE;
            if (q50Var2 != null) {
                if (z) {
                    i = i14 - i3;
                    if (i < 0) {
                        i = 0;
                    }
                } else {
                    i = iM7539i;
                }
                zq2Var.mo3586w0(i);
                if (z) {
                    i2 = i6;
                } else {
                    i2 = (i6 - iMax) - iCeil2;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                }
                zq2Var.mo3586w0(i2);
            }
            if (it.hasNext()) {
                try {
                    if (it instanceof vm0) {
                        throw new ClassCastException();
                    }
                    sq2Var5 = (sq2) it.next();
                } catch (IndexOutOfBoundsException unused2) {
                    sq2Var5 = null;
                }
            } else {
                sq2Var5 = null;
            }
            if (sq2Var5 != null) {
                if (y70.m13044y(y70.m13043x(sq2Var5)) == 0.0f) {
                    y70.m13043x(sq2Var5);
                    db3VarMo5826e = sq2Var5.mo5826e(jM5529I2);
                    jM7022b = j52.m7022b(db3VarMo5826e.mo4421j0(), db3VarMo5826e.mo4420i0());
                } else {
                    int iMo5823W2 = sq2Var5.mo5823W(Integer.MAX_VALUE);
                    jM7022b = j52.m7022b(iMo5823W2, sq2Var5.mo5825b0(iMo5823W2));
                    db3VarMo5826e = null;
                }
                j52VarM7021a2 = j52.m7021a(jM7022b);
            } else {
                it = it;
                jM5529I2 = jM5529I2;
                j52VarM7021a2 = null;
                db3VarMo5826e = null;
            }
            Integer numValueOf3 = j52VarM7021a2 != null ? Integer.valueOf(((int) (j52VarM7021a2.f22027a >> 32)) + i3) : null;
            Integer numValueOf4 = j52VarM7021a2 != null ? Integer.valueOf((int) (j52VarM7021a2.f22027a & 4294967295L)) : null;
            int i17 = i11;
            yj1 yj1VarM13643b2 = c1411zn.m13643b(it.hasNext(), i16, j52.m7022b(i14, i6), j52VarM7021a2 == null ? null : j52.m7021a(j52.m7022b(numValueOf3.intValue(), numValueOf4.intValue())), i17, i12, iMax, false, false);
            int i18 = iMax;
            if (yj1VarM13643b2.f35263a) {
                int iMin = Math.min(Math.max(i4, i13), iM7539i);
                int i19 = i12 + i18;
                yj1Var2 = yj1VarM13643b2;
                xj1 xj1VarM13642a2 = c1411zn.m13642a(yj1Var2, j52VarM7021a2 != null, i17, i19, i14, i16);
                kv2Var3.m7633a(i18);
                int i20 = (i6 - i19) - iCeil2;
                kv2Var = kv2Var4;
                kv2Var.m7633a(i15);
                i11 = i17 + 1;
                xj1Var = xj1VarM13642a2;
                i4 = iMin;
                i6 = i20;
                numValueOf = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i3) : null;
                i14 = iM7539i;
                i10 = i15;
                i12 = i19 + iCeil2;
                i18 = 0;
                i9 = 0;
            } else {
                yj1Var2 = yj1VarM13643b2;
                kv2Var = kv2Var4;
                numValueOf = numValueOf3;
                i11 = i17;
                i9 = i13;
            }
            kv2Var2 = kv2Var;
            db3Var3 = db3VarMo5826e;
            it = it;
            yj1Var3 = yj1Var2;
            i5 = i14;
            num = numValueOf4;
            i8 = i15;
            i7 = i18;
            jM5529I2 = jM5529I2;
        }
        kv2 kv2Var5 = kv2Var2;
        if (xj1Var != null) {
            xj1 xj1Var2 = xj1Var;
            long j2 = xj1Var2.f34319c;
            arrayList.add(xj1Var2.f34317a);
            lv2Var2.m8121h(arrayList.size() - 1, xj1Var2.f34318b);
            int i21 = kv2Var5.f23538b - 1;
            if (xj1Var2.f34320d) {
                kv2Var3.m7638f(i21, Math.max(kv2Var3.m7635c(i21), (int) (j2 & 4294967295L)));
                kv2Var5.m7638f(i21, kv2Var5.m7636d() + 1);
            } else {
                kv2Var3.m7633a((int) (j2 & 4294967295L));
                kv2Var5.m7633a(kv2Var5.m7636d() + 1);
            }
        }
        int size = arrayList.size();
        db3[] db3VarArr = new db3[size];
        for (int i22 = 0; i22 < size; i22++) {
            db3VarArr[i22] = lv2Var2.m8197b(i22);
        }
        int i23 = kv2Var5.f23538b;
        int[] iArr = new int[i23];
        int[] iArr2 = new int[i23];
        int[] iArr3 = kv2Var5.f23537a;
        int iMax2 = i4;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i25 < i23) {
            int i27 = iArr3[i25];
            int iM7635c = kv2Var3.m7635c(i25);
            mv2 mv2Var3 = mv2Var2;
            if (mv2Var3.m8404b(i25)) {
                c = 65535;
            } else {
                c = 65535;
                iM7635c = kl0.m7538h(jM8009a) == Integer.MAX_VALUE ? Integer.MAX_VALUE : kl0.m7538h(jM8009a) - i26;
            }
            mv2Var2 = mv2Var3;
            int i28 = i3;
            yq2 yq2VarM7624z = ks5.m7624z(dk1Var, iMax2, kl0.m7540j(jM8009a), kl0.m7539i(jM8009a), iM7635c, i28, zq2Var, arrayList, db3VarArr, i24, i27, iArr, i25);
            int iMo4506g = yq2VarM7624z.mo4506g();
            int iMo4504d = yq2VarM7624z.mo4504d();
            iArr2[i25] = iMo4504d;
            i26 += iMo4504d;
            iMax2 = Math.max(iMax2, iMo4506g);
            uw2Var.m11663b(yq2VarM7624z);
            i25++;
            i24 = i27;
            iArr3 = iArr3;
            i23 = i23;
            i3 = i28;
        }
        if (uw2Var.f32213c == 0) {
            iMax2 = 0;
            i26 = 0;
        }
        InterfaceC1299wn interfaceC1299wn = dk1Var.f17114b;
        int iMo3579U = ((uw2Var.f32213c - 1) * zq2Var.mo3579U(interfaceC1299wn.mo11068a())) + i26;
        int iM7540j = kl0.m7540j(jM5537h);
        int iM7538h2 = kl0.m7538h(jM5537h);
        if (iMo3579U < iM7540j) {
            iMo3579U = iM7540j;
        }
        if (iMo3579U <= iM7538h2) {
            iM7538h2 = iMo3579U;
        }
        interfaceC1299wn.mo10874h(zq2Var, iM7538h2, iArr2, iArr);
        int iM7541k2 = kl0.m7541k(jM5537h);
        int iM7539i2 = kl0.m7539i(jM5537h);
        if (iMax2 < iM7541k2) {
            iMax2 = iM7541k2;
        }
        if (iMax2 <= iM7539i2) {
            iM7539i2 = iMax2;
        }
        b71 b71Var = new b71((byte) 3);
        b71Var.f15141b = uw2Var;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iM7539i2, iM7538h2, map, b71Var);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: g */
    public final int mo6054g(s62 s62Var, List list, int i) {
        dk1 dk1Var = this.f32879a;
        ArrayList arrayListM12940H = y62.m12940H(s62Var);
        float f = dk1Var.f17117e;
        float f2 = dk1Var.f17115c;
        bk1 bk1Var = dk1Var.f17118f;
        List list2 = (List) hb0.m6302N0(arrayListM12940H, 1);
        sq2 sq2Var = list2 != null ? (sq2) hb0.m6301M0(list2) : null;
        List list3 = (List) hb0.m6302N0(arrayListM12940H, 2);
        bk1Var.m3612b(sq2Var, list3 != null ? (sq2) hb0.m6301M0(list3) : null, ll0.m8010b(0, i, 0, 0, 13));
        List list4 = (List) hb0.m6301M0(arrayListM12940H);
        if (list4 == null) {
            list4 = v71.f32439a;
        }
        return dk1Var.m4519a(list4, i, s62Var.mo3579U(f2), s62Var.mo3579U(f), dk1Var.f17118f);
    }

    public final int hashCode() {
        return this.f32879a.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0258  */
    /* JADX WARN: Code duplicated, block: B:147:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.xq2
    /* JADX INFO: renamed from: i */
    public final int mo6055i(s62 s62Var, List list, int i) {
        int i2;
        int[] iArr;
        int i3;
        long jM7022b;
        zj1 zj1Var;
        dk1 dk1Var = this.f32879a;
        ArrayList arrayListM12940H = y62.m12940H(s62Var);
        float f = dk1Var.f17117e;
        float f2 = dk1Var.f17115c;
        bk1 bk1Var = dk1Var.f17118f;
        int i4 = 1;
        List list2 = (List) hb0.m6302N0(arrayListM12940H, 1);
        sq2 sq2Var = list2 != null ? (sq2) hb0.m6301M0(list2) : null;
        List list3 = (List) hb0.m6302N0(arrayListM12940H, 2);
        int i5 = 0;
        bk1Var.m3612b(sq2Var, list3 != null ? (sq2) hb0.m6301M0(list3) : null, ll0.m8010b(0, 0, 0, i, 7));
        List list4 = (List) hb0.m6301M0(arrayListM12940H);
        if (list4 == null) {
            list4 = v71.f32439a;
        }
        int iMo3579U = s62Var.mo3579U(f2);
        int iMo3579U2 = s62Var.mo3579U(f);
        bk1 bk1Var2 = dk1Var.f17118f;
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr2 = new int[size];
        int size2 = list4.size();
        int[] iArr3 = new int[size2];
        List list5 = list4;
        int size3 = list5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            sq2 sq2Var2 = (sq2) list4.get(i6);
            int iMo5823W = sq2Var2.mo5823W(i);
            iArr2[i6] = iMo5823W;
            iArr3[i6] = sq2Var2.mo5825b0(iMo5823W);
        }
        int i7 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= list4.size() || !((zj1Var = bk1Var2.f15348a) == zj1.f36148c || zj1Var == zj1.f36149d)) {
            if (Integer.MAX_VALUE >= list4.size()) {
                bk1Var2.getClass();
                i2 = bk1Var2.f15348a == zj1.f36149d ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i2, list4.size());
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += iArr2[i9];
        }
        int size4 = ((list4.size() - 1) * iMo3579U) + i8;
        if (size2 != 0) {
            int i10 = iArr3[0];
            int i11 = size2 - 1;
            if (1 <= i11) {
                int i12 = 1;
                while (true) {
                    int i13 = iArr3[i12];
                    if (i10 < i13) {
                        i10 = i13;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
            if (size != 0) {
                int i14 = iArr2[0];
                int i15 = size - 1;
                if (1 <= i15) {
                    int i16 = 1;
                    while (true) {
                        int i17 = iArr2[i16];
                        if (i14 < i17) {
                            i14 = i17;
                        }
                        if (i16 == i15) {
                            break;
                        }
                        i16++;
                    }
                }
                int i18 = size4;
                while (i14 <= size4 && i10 != i) {
                    int i19 = (i14 + size4) / 2;
                    if (list4.isEmpty()) {
                        jM7022b = j52.m7022b(i5, i5);
                    } else {
                        C1411zn c1411zn = new C1411zn(bk1Var2, ll0.m8009a(i5, i19, i5, i7), iMo3579U, iMo3579U2);
                        sq2 sq2Var3 = (sq2) hb0.m6302N0(list4, i5);
                        int i20 = sq2Var3 != null ? iArr3[i5] : i5;
                        int i21 = sq2Var3 != null ? iArr2[i5] : i5;
                        int i22 = 0;
                        int i23 = 0;
                        if (c1411zn.m13643b(list4.size() > i4 ? i4 : 0, 0, j52.m7022b(i19, i7), sq2Var3 == null ? null : j52.m7021a(j52.m7022b(i21, i20)), 0, 0, 0, false, false).f35264b) {
                            j52 j52VarM3611a = bk1Var2.m3611a(0, 0, sq2Var3 != null ? i4 : 0);
                            jM7022b = j52.m7022b(j52VarM3611a != null ? (int) (j52VarM3611a.f22027a & 4294967295L) : 0, 0);
                        } else {
                            int i24 = 0;
                            int size5 = list5.size();
                            int i25 = i19;
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                if (i24 >= size5) {
                                    i19 = i19;
                                    iArr = iArr2;
                                    i3 = i26;
                                    break;
                                }
                                int i29 = i25 - i21;
                                i3 = i24 + 1;
                                int iMax = Math.max(i28, i20);
                                sq2 sq2Var4 = (sq2) hb0.m6302N0(list4, i3);
                                i20 = sq2Var4 != null ? iArr3[i3] : 0;
                                int i30 = sq2Var4 != null ? iArr2[i3] + iMo3579U : 0;
                                iArr = iArr2;
                                int i31 = i3 - i27;
                                yj1 yj1VarM13643b = c1411zn.m13643b(i24 + 2 < list4.size(), i31, j52.m7022b(i29, Integer.MAX_VALUE), sq2Var4 == null ? null : j52.m7021a(j52.m7022b(i30, i20)), i22, i23, iMax, false, false);
                                if (yj1VarM13643b.f35263a) {
                                    int i32 = iMax + iMo3579U2 + i23;
                                    int i33 = i22;
                                    xj1 xj1VarM13642a = c1411zn.m13642a(yj1VarM13643b, sq2Var4 != null, i33, i32, i29, i31);
                                    i30 -= iMo3579U;
                                    i22 = i33 + 1;
                                    if (yj1VarM13643b.f35264b) {
                                        if (xj1VarM13642a != null) {
                                            long j = xj1VarM13642a.f34319c;
                                            if (!xj1VarM13642a.f34320d) {
                                                i32 = ((int) (j & 4294967295L)) + iMo3579U2 + i32;
                                            }
                                        }
                                        i23 = i32;
                                        break;
                                    }
                                    i27 = i3;
                                    i23 = i32;
                                    i25 = i19;
                                    i28 = 0;
                                } else {
                                    i25 = i29;
                                    i28 = iMax;
                                }
                                i21 = i30;
                                i24 = i3;
                                i26 = i24;
                                i19 = i19;
                                iArr2 = iArr;
                            }
                            jM7022b = j52.m7022b(i23 - iMo3579U2, i3);
                        }
                        i10 = (int) (jM7022b >> 32);
                        int i34 = (int) (jM7022b & 4294967295L);
                        if (i10 <= i || i34 < iMin) {
                            i14 = i19 + 1;
                            if (i14 > size4) {
                                return i14;
                            }
                        } else {
                            if (i10 >= i) {
                                return i19;
                            }
                            size4 = i19 - 1;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        i4 = 1;
                        i7 = Integer.MAX_VALUE;
                        i5 = 0;
                    }
                    i19 = i19;
                    iArr = iArr2;
                    i10 = (int) (jM7022b >> 32);
                    int i35 = (int) (jM7022b & 4294967295L);
                    if (i10 <= i) {
                        i14 = i19 + 1;
                        if (i14 > size4) {
                            return i14;
                        }
                    } else {
                        i14 = i19 + 1;
                        if (i14 > size4) {
                            return i14;
                        }
                    }
                    i18 = i19;
                    iArr2 = iArr;
                    i4 = 1;
                    i7 = Integer.MAX_VALUE;
                    i5 = 0;
                }
                return i18;
            }
            xy4.m12795x();
        } else {
            xy4.m12795x();
        }
        return 0;
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f32879a + ")";
    }
}
