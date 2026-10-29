package p000;

import android.graphics.RectF;
import essentials.accessibility.EsAccessibilityService;
import essentials.notificationlistener.EsNotificationListenerService;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1017p0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27254b;

    public /* synthetic */ C1017p0(byte b) {
        this.f27253a = b;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0223 A[Catch: all -> 0x0243, LOOP:4: B:102:0x01f7->B:112:0x0223, LOOP_END, TryCatch #0 {, blocks: (B:99:0x01d9, B:102:0x01f7, B:104:0x0203, B:106:0x020d, B:108:0x0213, B:109:0x021b, B:112:0x0223, B:113:0x0226, B:115:0x022c, B:117:0x0235), top: B:369:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:328:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:330:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:331:0x07be  */
    /* JADX WARN: Code duplicated, block: B:333:0x07c6 A[PHI: r1
  0x07c6: PHI (r1v26 e64) = (r1v25 e64), (r1v29 e64) binds: [B:336:0x07d2, B:332:0x07c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:395:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0056, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [ir1, mi0] */
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
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        boolean zM7172h;
        e64 e64Var;
        Object obj3;
        Object obj4;
        xn2 xn2Var;
        Object obj5;
        Object obj6;
        long j;
        char c;
        char c2;
        char c3 = 7;
        ?? r13 = 0;
        t82 t82Var = null;
        a70 a70VarM5165C = null;
        byte b = 1;
        switch (this.f27253a) {
            case 0:
                AbstractC1091r0 abstractC1091r0 = (AbstractC1091r0) this.f27254b;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    abstractC1091r0.mo3976a(0, ir1Var);
                } else {
                    ir1Var.m6874W();
                }
                return ju4.f22634a;
            case 1:
                iy3 iy3Var = (iy3) this.f27254b;
                lb5.m7910S(iy3Var.m8391C0(), null, null, new C0931n2(iy3Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                ds3 ds3Var = (ds3) this.f27254b;
                jl3 jl3VarM6072J = gq6.m6072J((RectF) obj);
                jl3 jl3VarM6072J2 = gq6.m6072J((RectF) obj2);
                switch (ds3Var.f17332a) {
                    case 20:
                        zM7172h = jl3VarM6072J.m7172h(jl3VarM6072J2);
                        break;
                    default:
                        zM7172h = jl3VarM6072J2.m7166a(jl3VarM6072J.m7167c());
                        break;
                }
                return Boolean.valueOf(zM7172h);
            case 3:
                g44 g44Var = (g44) this.f27254b;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0638f5.m5530a((String) g44Var.getValue(), null, false, ir1Var2, 0, 6);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4.f22634a;
            case 4:
                ((Integer) obj2).getClass();
                ((wv1) this.f27254b).m12424k(vd6.m11838V(7), (mi0) obj);
                return ju4.f22634a;
            case 5:
                d64 d64Var = (d64) this.f27254b;
                C0940nb c0940nb = d64Var.f16820d;
                float fM7538h = kl0.m7538h(((kl0) obj2).f23210a);
                float f = (int) (((w52) obj).f33109a & 4294967295L);
                C0891m c0891m = AbstractC0485bb.f15192a;
                z32 z32Var = new z32((byte) 12);
                z32Var.f35738b = new ArrayList();
                float[] fArr = new float[5];
                for (int i = 0; i < 5; i++) {
                    fArr[i] = Float.NaN;
                }
                z32Var.f35739c = fArr;
                VarHandle.storeStoreFence();
                e64 e64Var2 = e64.f17842a;
                z32Var.m13324q(e64Var2, fM7538h);
                Set set = d64Var.f16817a;
                e64 e64Var3 = e64.f17844c;
                if (set.contains(e64Var3)) {
                    z32Var.m13324q(e64Var3, fM7538h - Math.min(fM7538h / 2.0f, f));
                }
                if (f != 0.0f) {
                    z32Var.m13324q(e64.f17843b, Math.max(0.0f, fM7538h - f));
                }
                ArrayList arrayList = (ArrayList) z32Var.f35738b;
                float[] fArr2 = (float[]) z32Var.f35739c;
                int size = arrayList.size();
                zt5.m13785p(size, fArr2.length);
                uv0 uv0Var = new uv0(arrayList, Arrays.copyOfRange(fArr2, 0, size));
                int iOrdinal = ((e64) ((wy0) c0940nb.f25611h).getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        e64Var = e64.f17843b;
                        if (uv0Var.m11653c(e64Var)) {
                            e64Var2 = e64Var;
                        }
                    } else {
                        if (iOrdinal != 2) {
                            C0670g.m5864c();
                            return null;
                        }
                        uv0 uv0VarM8670h = c0940nb.m8670h();
                        if (uv0VarM8670h.m11653c(e64Var3)) {
                            e64 e64Var4 = e64.f17843b;
                            if (uv0VarM8670h.m11653c(e64Var4) && uv0VarM8670h.m11656f(e64Var3) == uv0VarM8670h.m11656f(e64Var4) && uv0Var.m11653c(e64Var4)) {
                                e64Var2 = e64Var4;
                            } else if (uv0Var.m11653c(e64Var3)) {
                                e64Var2 = e64Var3;
                            } else {
                                e64Var = e64.f17843b;
                                if (uv0Var.m11653c(e64Var)) {
                                    e64Var2 = e64Var;
                                }
                            }
                        } else if (uv0Var.m11653c(e64Var3)) {
                            e64Var2 = e64Var3;
                        } else {
                            e64Var = e64.f17843b;
                            if (uv0Var.m11653c(e64Var)) {
                                e64Var2 = e64Var;
                            }
                        }
                    }
                }
                return new l73(uv0Var, e64Var2);
            case 6:
                ((Integer) obj2).getClass();
                q20.m9702a((nt2) this.f27254b, (mi0) obj, vd6.m11838V(1));
                return ju4.f22634a;
            case 7:
                pg0 pg0Var = zy5.f36474c;
                Object obj7 = this.f27254b;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pg0Var.invoke(obj7, ir1Var3, 0);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4.f22634a;
            case 8:
                ArrayList arrayList2 = (ArrayList) this.f27254b;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    gl4.m6037b(hb0.m6305Q0(arrayList2, ", ", null, null, 0, null, 62).concat(" and more!"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var4, 0, 0, 262142);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4.f22634a;
            case 9:
                kr3 kr3Var = (kr3) this.f27254b;
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz2 pz2Var = (pz2) ir1Var5.m6898k(rz2.m10508a());
                    pg0 pg0Var2 = kr3Var.f23353b;
                    boolean zM6890g = ir1Var5.m6890g(pz2Var) | ir1Var5.m6890g(kr3Var);
                    Object objM6869O = ir1Var5.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        obj3 = objM6869O;
                        C0558d0 c0558d0 = new C0558d0((byte) 24);
                        c0558d0.f16655b = pz2Var;
                        c0558d0.f16656c = kr3Var;
                        VarHandle.storeStoreFence();
                        ir1Var5.m6905n0(c0558d0);
                        obj3 = c0558d0;
                    }
                    obj3 = objM6869O;
                    pg0Var2.invoke((yp1) obj3, ir1Var5, 0);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4.f22634a;
            case 10:
                ((Integer) obj2).getClass();
                ((fi0) this.f27254b).mo3976a(vd6.m11838V(1), (mi0) obj);
                return ju4.f22634a;
            case 11:
                mi0 mi0Var6 = (mi0) this.f27254b;
                nt2 nt2Var = (nt2) obj;
                nt2 nt2VarM10042z = (lt2) obj2;
                if (nt2VarM10042z instanceof ji0) {
                    nq1 nq1Var = ((ji0) nt2VarM10042z).f22297r;
                    as4.m3259r(3, nq1Var);
                    nt2VarM10042z = qq2.m10042z(mi0Var6, (nt2) nq1Var.invoke(kt2.f23428a, mi0Var6, 0));
                }
                return nt2Var.mo7630d(nt2VarM10042z);
            case 12:
                om3 om3Var = (om3) this.f27254b;
                ((Integer) obj).getClass();
                if (obj2 instanceof ph0) {
                    ph0 ph0Var = (ph0) obj2;
                    mw2 mw2Var = om3Var.f26887h;
                    if (mw2Var == null) {
                        mw2 mw2Var2 = uv3.f32207a;
                        mw2Var = new mw2();
                        om3Var.f26887h = mw2Var;
                    }
                    mw2Var.m8419k(ph0Var);
                    om3Var.f26885f.m11663b(ph0Var);
                }
                if (obj2 instanceof mr1) {
                    om3Var.m9188e((mr1) obj2);
                }
                if (obj2 instanceof yk3) {
                    ((yk3) obj2).m13154c();
                }
                return ju4.f22634a;
            case 13:
                ql3 ql3Var = (ql3) this.f27254b;
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var7;
                if (ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ql3Var.f28555a = dt0.m4685N(ir1Var6);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4.f22634a;
            case 14:
                ((Integer) obj2).getClass();
                oh6.m9106l((pk4) this.f27254b, (mi0) obj, vd6.m11838V(1));
                return ju4.f22634a;
            case 15:
                kj4 kj4Var = (kj4) this.f27254b;
                ((Integer) obj2).getClass();
                ir1 ir1Var7 = (ir1) ((mi0) obj);
                ir1Var7.m6885d0(666084174);
                String str = kj4Var.f23180b;
                ir1Var7.m6912r(false);
                return str;
            case 16:
                EsAccessibilityService esAccessibilityService = (EsAccessibilityService) this.f27254b;
                mi0 mi0Var8 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i2 = EsAccessibilityService.f18443d;
                ju4 ju4Var = ju4.f22634a;
                i50 i50Var = ki0.f23136a;
                ir1 ir1Var8 = (ir1) mi0Var8;
                if (ir1Var8.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    xn2 xn2Var2 = (xn2) ir1Var8.m6898k(yn2.f35357b);
                    if (xn2Var2 == null) {
                        ir1Var8.m6885d0(-1476823888);
                        ir1Var8.m6912r(false);
                        xn2Var = null;
                    } else {
                        ir1Var8.m6885d0(-1476823887);
                        boolean zM6890g2 = ir1Var8.m6890g("AccessibilityService") | ir1Var8.m6890g(xn2Var2);
                        Object objM6869O2 = ir1Var8.m6869O();
                        if (zM6890g2 || objM6869O2 == i50Var) {
                            obj4 = objM6869O2;
                            xn2 xn2VarM12723c = xn2Var2.m12723c("AccessibilityService");
                            ir1Var8.m6905n0(xn2VarM12723c);
                            obj4 = xn2VarM12723c;
                        }
                        xn2Var = (xn2) obj4;
                        ir1Var8.m6912r(false);
                    }
                    esAccessibilityService.f18446c = xn2Var;
                    if (xn2Var != null) {
                        ir1Var8.m6885d0(1502749893);
                        boolean zM6894i = ir1Var8.m6894i(esAccessibilityService);
                        Object objM6869O3 = ir1Var8.m6869O();
                        if (zM6894i || objM6869O3 == i50Var) {
                            obj5 = objM6869O3;
                            b71 b71Var = new b71(b);
                            b71Var.f15141b = esAccessibilityService;
                            VarHandle.storeStoreFence();
                            ir1Var8.m6905n0(b71Var);
                            obj5 = b71Var;
                        }
                        lb5.m7923d(ju4Var, (yp1) obj5, ir1Var8);
                        ir1Var8.m6912r(false);
                    } else {
                        ir1Var8.m6885d0(1502894043);
                        ir1Var8.m6912r(false);
                    }
                    C1354y3 c1354y3 = (C1354y3) ir1Var8.m6898k(AbstractC0637f4.f18723a);
                    esAccessibilityService.f18444a = c1354y3;
                    boolean zM6890g3 = ir1Var8.m6890g(c1354y3) | ir1Var8.m6894i(esAccessibilityService);
                    Object objM6869O4 = ir1Var8.m6869O();
                    Object obj8 = objM6869O4;
                    if (zM6890g3 || objM6869O4 == i50Var) {
                        s45 s45Var = new s45(b);
                        s45Var.f29909b = c1354y3;
                        s45Var.f29910c = esAccessibilityService;
                        VarHandle.storeStoreFence();
                        ir1Var8.m6905n0(s45Var);
                        obj8 = s45Var;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj8, ir1Var8);
                    boolean zM6890g4 = ir1Var8.m6890g(c1354y3) | ir1Var8.m6894i(esAccessibilityService);
                    Object objM6869O5 = ir1Var8.m6869O();
                    Object obj9 = objM6869O5;
                    if (zM6890g4 || objM6869O5 == i50Var) {
                        C0594e0 c0594e0 = new C0594e0((Object) c1354y3, (Object) esAccessibilityService, (wm0) r13, (byte) 28);
                        ir1Var8.m6905n0(c0594e0);
                        obj9 = c0594e0;
                    }
                    lb5.m7926g(ir1Var8, (mq1) obj9, ju4Var);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            case 17:
                EsNotificationListenerService esNotificationListenerService = (EsNotificationListenerService) this.f27254b;
                mi0 mi0Var9 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i3 = EsNotificationListenerService.f18453c;
                i50 i50Var2 = ki0.f23136a;
                ?? r2 = (ir1) mi0Var9;
                if (r2.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    b23 b23Var = (b23) r2.m6898k(y13.f34814a);
                    esNotificationListenerService.f18455b = b23Var;
                    xn2 xn2Var3 = (xn2) r2.m6898k(yn2.f35357b);
                    if (xn2Var3 == null) {
                        r2.m6885d0(-1476823888);
                        r2.m6912r(false);
                    } else {
                        r2.m6885d0(-1476823887);
                        boolean zM6890g5 = r2.m6890g("NotificationService") | r2.m6890g(xn2Var3);
                        Object objM6869O6 = r2.m6869O();
                        if (zM6890g5 || objM6869O6 == i50Var2) {
                            obj6 = objM6869O6;
                            xn2 xn2VarM12723c2 = xn2Var3.m12723c("NotificationService");
                            r2.m6905n0(xn2VarM12723c2);
                            obj6 = xn2VarM12723c2;
                        }
                        r2.m6912r(false);
                        r13 = (xn2) obj6;
                    }
                    boolean zM6894i2 = r2.m6894i(r13) | r2.m6890g(b23Var) | r2.m6894i(esNotificationListenerService);
                    Object objM6869O7 = r2.m6869O();
                    Object obj10 = objM6869O7;
                    if (zM6894i2 || objM6869O7 == i50Var2) {
                        C1164t c1164t = new C1164t((byte) 14);
                        c1164t.f30700c = r13;
                        c1164t.f30699b = b23Var;
                        c1164t.f30701d = esNotificationListenerService;
                        VarHandle.storeStoreFence();
                        r2.m6905n0(c1164t);
                        obj10 = c1164t;
                    }
                    lb5.m7923d(b23Var, (yp1) obj10, r2);
                } else {
                    r2.m6874W();
                }
                return ju4.f22634a;
            case 18:
                pz2 pz2Var2 = (pz2) this.f27254b;
                mi0 mi0Var10 = (mi0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ir1 ir1Var9 = (ir1) mi0Var10;
                if (ir1Var9.m6871T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    zz2.m13893a(pz2Var2, null, null, null, null, null, null, ir1Var9, 0);
                } else {
                    ir1Var9.m6874W();
                }
                return ju4.f22634a;
            case 19:
                ih0 ih0Var = ih0.f21417c;
                a44 a44Var = (a44) this.f27254b;
                mi0 mi0Var11 = (mi0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ir1 ir1Var10 = (ir1) mi0Var11;
                if (ir1Var10.m6871T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ie1 ie1Var = (ie1) ih0Var.get(a44Var);
                    dc0 dc0VarM6566A = i20.m6566A(ie1Var, ir1Var10);
                    long j2 = ((pb0) ie1Var.f21284b.f18930a.invoke(dc0VarM6566A)).f27503a;
                    zc6.m13516a(kx5.m7694Y(pb0.m9462a(j2), pb0.m9462a(ic0.m6741a(dc0VarM6566A, j2))), ir1Var10, 0);
                } else {
                    ir1Var10.m6874W();
                }
                return ju4.f22634a;
            case 20:
                ie1 ie1Var2 = (ie1) this.f27254b;
                mi0 mi0Var12 = (mi0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ir1 ir1Var11 = (ir1) mi0Var12;
                if (ir1Var11.m6871T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pb0 pb0Var = ie1Var2.f21283a;
                    if (pb0Var == null) {
                        ir1Var11.m6885d0(-1743943628);
                        j = ((lq2) ir1Var11.m6898k(pq2.f27894b)).f24277a.f16940a;
                        ir1Var11.m6912r(false);
                    } else {
                        ir1Var11.m6885d0(-1743945054);
                        ir1Var11.m6912r(false);
                        j = pb0Var.f27503a;
                    }
                    zc6.m13516a(Collections.singletonList(pb0.m9462a(j)), ir1Var11, 0);
                } else {
                    ir1Var11.m6874W();
                }
                return ju4.f22634a;
            case 21:
                wh1 wh1Var = (wh1) this.f27254b;
                mi0 mi0Var13 = (mi0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ir1 ir1Var12 = (ir1) mi0Var13;
                if (ir1Var12.m6871T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    je0.m7085a(((sh1) wh1Var.f33379a.getValue()) == (ir1Var12.m6898k(ln0.f24194e) == dn0.f17204b ? sh1.f30270b : sh1.f30271c) ? (g12) o02.f26256m.getValue() : (g12) o02.f26255l.getValue(), null, null, ir1Var12, 0, 6);
                } else {
                    ir1Var12.m6874W();
                }
                return ju4.f22634a;
            case 22:
                ((Integer) obj2).getClass();
                ((i32) this.f27254b).m6636a(vd6.m11838V(1), (mi0) obj);
                return ju4.f22634a;
            case 23:
                ((yj4) this.f27254b).mo8001d(((b33) obj2).f15059a);
                return ju4.f22634a;
            case 24:
                dv2 dv2Var = (dv2) this.f27254b;
                Set set2 = (Set) obj;
                ql3 ql3Var2 = new ql3();
                synchronized (dv2Var.f36084a) {
                    lw2 lw2Var = dv2Var.f17425f;
                    C1164t c1164t2 = new C1164t((byte) 21);
                    c1164t2.f30700c = set2;
                    c1164t2.f30699b = dv2Var;
                    c1164t2.f30701d = ql3Var2;
                    VarHandle.storeStoreFence();
                    as4.m3259r(1, c1164t2);
                    Object[] objArr = lw2Var.f24419b;
                    long[] jArr = lw2Var.f24418a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j3 = jArr[i4];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j3 & 255) < 128) {
                                        c1164t2.invoke(objArr[(i4 << 3) + i6]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i5 == 8) {
                                    if (i4 != length) {
                                        i4++;
                                    }
                                }
                            } else if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                    List list = (List) ql3Var2.f28555a;
                    if (list != null) {
                        int size2 = list.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            ((y14) list.get(i7)).mo5493n(ju4.f22634a);
                        }
                    }
                }
                return ju4.f22634a;
            case 25:
                xz2 xz2Var = (xz2) this.f27254b;
                mi0 mi0Var14 = (mi0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ir1 ir1Var13 = (ir1) mi0Var14;
                if (ir1Var13.m6871T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    xz2Var.f34741f.invoke(ir1Var13, 0);
                } else {
                    ir1Var13.m6874W();
                }
                return ju4.f22634a;
            case 26:
                wv3 wv3Var = (wv3) this.f27254b;
                mi0 mi0Var15 = (mi0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ir1 ir1Var14 = (ir1) mi0Var15;
                if (ir1Var14.m6871T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    wv3Var.mo12428c().invoke(ir1Var14, 0);
                } else {
                    ir1Var14.m6874W();
                }
                return ju4.f22634a;
            case 27:
                ((Integer) obj2).getClass();
                ((cd3) this.f27254b).mo3976a(vd6.m11838V(1), (mi0) obj);
                return ju4.f22634a;
            case 28:
                el3 el3Var = (el3) this.f27254b;
                Set set3 = (Set) obj;
                synchronized (el3Var.f18216c) {
                    try {
                        if (((cl3) el3Var.f18234u.getValue()).compareTo(cl3.f16103e) >= 0) {
                            mw2 mw2Var3 = el3Var.f18221h;
                            if (set3 instanceof vv3) {
                                mw2 mw2Var4 = ((vv3) set3).f32888a;
                                Object[] objArr2 = mw2Var4.f25258b;
                                long[] jArr2 = mw2Var4.f25257a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j4 = jArr2[i8];
                                        if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj11 = objArr2[(i8 << 3) + i10];
                                                    c2 = c3;
                                                    if (!(obj11 instanceof ic4) || ((ic4) obj11).m6749f(1)) {
                                                        mw2Var3.m8409a(obj11);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j4 >>= 8;
                                                i10++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i9 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i8 != length2) {
                                            i8++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj12 : set3) {
                                    if (!(obj12 instanceof ic4) || ((ic4) obj12).m6749f(1)) {
                                        mw2Var3.m8409a(obj12);
                                    }
                                }
                            }
                            a70VarM5165C = el3Var.m5165C();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (a70VarM5165C != null) {
                    ((b70) a70VarM5165C).resumeWith(ju4.f22634a);
                }
                return ju4.f22634a;
            default:
                rt3 rt3Var = (rt3) this.f27254b;
                int iIntValue15 = ((Integer) obj).intValue();
                po0 po0Var = (po0) obj2;
                qo0 key = po0Var.getKey();
                po0 po0Var2 = rt3Var.f29607u.get(key);
                if (key == o85.f26448h) {
                    t82 t82Var2 = (t82) po0Var2;
                    t82 parent = (t82) po0Var;
                    while (parent != null) {
                        if (parent != t82Var2 && (parent instanceof nw3)) {
                            e90 e90Var = (e90) AbstractC1078qo.f28633a.getObjectVolatile((nw3) parent, e92.f17907a);
                            parent = e90Var != null ? e90Var.getParent() : null;
                        } else {
                            t82Var = parent;
                            if (t82Var == t82Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + t82Var + ", expected child of " + t82Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (t82Var2 != null) {
                                iIntValue15++;
                            }
                        }
                    }
                    if (t82Var == t82Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + t82Var + ", expected child of " + t82Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (t82Var2 != null) {
                        iIntValue15++;
                    }
                } else if (po0Var != po0Var2) {
                    iIntValue15 = Integer.MIN_VALUE;
                } else {
                    iIntValue15++;
                }
                return Integer.valueOf(iIntValue15);
        }
    }
}
