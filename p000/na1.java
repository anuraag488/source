package p000;

import android.graphics.Typeface;
import android.media.session.MediaController;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25594a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25595b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25596c;

    public /* synthetic */ na1(byte b) {
        this.f25594a = b;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0574  */
    /* JADX WARN: Code duplicated, block: B:171:0x0585  */
    /* JADX WARN: Code duplicated, block: B:173:0x0594  */
    /* JADX WARN: Code duplicated, block: B:195:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:198:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:200:0x0603  */
    /* JADX WARN: Code duplicated, block: B:256:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:259:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:261:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:355:0x089b  */
    /* JADX WARN: Code duplicated, block: B:356:0x089d  */
    /* JADX WARN: Code duplicated, block: B:409:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x06f8 A[SYNTHETIC] */
    @Override // p000.yp1
    public final Object invoke(Object obj) throws Throwable {
        l73 l73Var;
        gs4 gs4Var;
        hs4 hs4Var;
        Object objInvoke;
        C1153sp c1153sp;
        Object objM7389n;
        List list;
        int size;
        int i;
        Object obj2;
        int size2;
        int i2;
        Object obj3;
        int size3;
        int i3;
        Object obj4;
        Object obj5;
        Typeface typefaceM10206g;
        hs4 hs4Var2;
        gk2 lifecycle;
        byte b = 9;
        byte b2 = 11;
        byte b3 = 7;
        int i4 = 0;
        boolean z = false;
        byte b4 = 3;
        Throwable th = null;
        byte b5 = 1;
        switch (this.f25594a) {
            case 0:
                EsApp esApp = (EsApp) this.f25595b;
                sw2 sw2Var = (sw2) this.f25596c;
                int i5 = EsApp.f18450c;
                oa1 oa1Var = new oa1();
                oa1Var.f26496a = sw2Var;
                VarHandle.storeStoreFence();
                esApp.registerComponentCallbacks(oa1Var);
                C0562d4 c0562d4 = new C0562d4(b3);
                c0562d4.f16768b = esApp;
                c0562d4.f16769c = oa1Var;
                VarHandle.storeStoreFence();
                return c0562d4;
            case 1:
                xn2 xn2Var = (xn2) this.f25595b;
                InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) this.f25596c;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "enable feature", null);
                    }
                }
                if (interfaceC0755ia != null) {
                    interfaceC0755ia.mo6705a("feature_activated", "true");
                }
                C1032pf c1032pf = new C1032pf(b3);
                c1032pf.f27570b = xn2Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 2:
                yp1 yp1Var = (yp1) this.f25595b;
                lv1 lv1Var = (lv1) this.f25596c;
                yp1Var.invoke((ie1) obj);
                if (lv1Var != null) {
                    nc4 nc4Var = nv1.f26110a;
                    lv1Var.m8115a(new dv1(d55.m4371p(0.3f, 1, 0), nv1.m8856a()));
                }
                return ju4.f22634a;
            case 3:
                p44 p44Var = (p44) this.f25595b;
                jp3 jp3Var = (jp3) obj;
                jp3Var.m7259m(jp3Var.f22505q.mo3580c() * ((p11) ((xb4) this.f25596c).getValue()).f27285a);
                jp3Var.m7260n(p44Var);
                jp3Var.m7255h(true);
                return ju4.f22634a;
            case 4:
                ((nv2) this.f25595b).m8861b((tk1) this.f25596c);
                return ju4.f22634a;
            case 5:
                cm1 cm1Var = (cm1) this.f25595b;
                fs4 fs4Var = (fs4) this.f25596c;
                yp1 yp1Var2 = (yp1) obj;
                im1 im1Var = cm1Var.f16124d;
                C0572de c0572de = cm1Var.f16121a;
                b71 b71Var = cm1Var.f16126f;
                bm1 bm1Var = fs4Var.f19249a;
                if (bm1Var instanceof gm1) {
                    List list2 = ((gm1) bm1Var).f19879d;
                    xm1 xm1Var = fs4Var.f19250b;
                    int i6 = fs4Var.f19251c;
                    ArrayList arrayList = new ArrayList(list2.size());
                    List list3 = list2;
                    int size4 = list3.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj6 = list2.get(i7);
                        vt1 vt1Var = (vt1) obj6;
                        if (z62.m13387o(vt1Var.f32856e, xm1Var) && vt1Var.f32857f == i6) {
                            arrayList.add(obj6);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size5 = list3.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            Object obj7 = list2.get(i8);
                            if (((vt1) obj7).f32857f == i6) {
                                arrayList2.add(obj7);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list2 = arrayList2;
                        }
                        List list4 = list2;
                        int iCompareTo = xm1Var.compareTo(xm1.f34409b);
                        int i9 = xm1Var.f34418a;
                        if (iCompareTo < 0) {
                            List list5 = list4;
                            int size6 = list5.size();
                            xm1 xm1Var2 = null;
                            xm1 xm1Var3 = null;
                            for (int i10 = 0; i10 < size6; i10++) {
                                xm1 xm1Var4 = ((vt1) list4.get(i10)).f32856e;
                                int i11 = xm1Var4.f34418a;
                                if (z62.m13393u(i11, i9) < 0) {
                                    if (xm1Var2 == null || z62.m13393u(i11, xm1Var2.f34418a) > 0) {
                                        xm1Var2 = xm1Var4;
                                    }
                                } else if (z62.m13393u(i11, i9) <= 0) {
                                    xm1Var2 = xm1Var4;
                                    xm1Var3 = xm1Var2;
                                    if (xm1Var2 == null) {
                                        xm1Var2 = xm1Var3;
                                    }
                                    arrayList = new ArrayList(list4.size());
                                    size3 = list5.size();
                                    for (i3 = 0; i3 < size3; i3++) {
                                        obj4 = list4.get(i3);
                                        if (z62.m13387o(((vt1) obj4).f32856e, xm1Var2)) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                } else if (xm1Var3 == null || z62.m13393u(i11, xm1Var3.f34418a) < 0) {
                                    xm1Var3 = xm1Var4;
                                }
                            }
                            if (xm1Var2 == null) {
                                xm1Var2 = xm1Var3;
                            }
                            arrayList = new ArrayList(list4.size());
                            size3 = list5.size();
                            while (i3 < size3) {
                                obj4 = list4.get(i3);
                                if (z62.m13387o(((vt1) obj4).f32856e, xm1Var2)) {
                                    arrayList.add(obj4);
                                }
                            }
                        } else {
                            xm1 xm1Var5 = xm1.f34410c;
                            if (xm1Var.compareTo(xm1Var5) > 0) {
                                List list6 = list4;
                                int size7 = list6.size();
                                xm1 xm1Var6 = null;
                                xm1 xm1Var7 = null;
                                for (int i12 = 0; i12 < size7; i12++) {
                                    xm1 xm1Var8 = ((vt1) list4.get(i12)).f32856e;
                                    int i13 = xm1Var8.f34418a;
                                    if (z62.m13393u(i13, i9) < 0) {
                                        if (xm1Var6 == null || z62.m13393u(i13, xm1Var6.f34418a) > 0) {
                                            xm1Var6 = xm1Var8;
                                        }
                                    } else if (z62.m13393u(i13, i9) <= 0) {
                                        xm1Var6 = xm1Var8;
                                        xm1Var7 = xm1Var6;
                                        if (xm1Var7 != null) {
                                            xm1Var6 = xm1Var7;
                                        }
                                        arrayList = new ArrayList(list4.size());
                                        size2 = list6.size();
                                        for (i2 = 0; i2 < size2; i2++) {
                                            obj3 = list4.get(i2);
                                            if (z62.m13387o(((vt1) obj3).f32856e, xm1Var6)) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                    } else if (xm1Var7 == null || z62.m13393u(i13, xm1Var7.f34418a) < 0) {
                                        xm1Var7 = xm1Var8;
                                    }
                                }
                                if (xm1Var7 != null) {
                                    xm1Var6 = xm1Var7;
                                }
                                arrayList = new ArrayList(list4.size());
                                size2 = list6.size();
                                while (i2 < size2) {
                                    obj3 = list4.get(i2);
                                    if (z62.m13387o(((vt1) obj3).f32856e, xm1Var6)) {
                                        arrayList.add(obj3);
                                    }
                                }
                            } else {
                                List list7 = list4;
                                int size8 = list7.size();
                                xm1 xm1Var9 = null;
                                xm1 xm1Var10 = null;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size8) {
                                        xm1 xm1Var11 = ((vt1) list4.get(i14)).f32856e;
                                        list = list7;
                                        if (z62.m13393u(xm1Var11.f34418a, xm1Var5.f34418a) <= 0) {
                                            int i15 = xm1Var11.f34418a;
                                            if (z62.m13393u(i15, i9) < 0) {
                                                if (xm1Var9 == null || z62.m13393u(i15, xm1Var9.f34418a) > 0) {
                                                    xm1Var9 = xm1Var11;
                                                }
                                            } else if (z62.m13393u(i15, i9) <= 0) {
                                                xm1Var9 = xm1Var11;
                                                xm1Var10 = xm1Var9;
                                            } else if (xm1Var10 == null || z62.m13393u(i15, xm1Var10.f34418a) < 0) {
                                                xm1Var10 = xm1Var11;
                                            }
                                        }
                                        i14++;
                                        list7 = list;
                                    } else {
                                        list = list7;
                                    }
                                }
                                if (xm1Var10 != null) {
                                    xm1Var9 = xm1Var10;
                                }
                                arrayList = new ArrayList(list4.size());
                                int size9 = list.size();
                                for (int i16 = 0; i16 < size9; i16++) {
                                    Object obj8 = list4.get(i16);
                                    if (z62.m13387o(((vt1) obj8).f32856e, xm1Var9)) {
                                        arrayList.add(obj8);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    xm1 xm1Var12 = xm1.f34410c;
                                    int size10 = list.size();
                                    xm1 xm1Var13 = null;
                                    xm1 xm1Var14 = null;
                                    for (int i17 = 0; i17 < size10; i17++) {
                                        xm1 xm1Var15 = ((vt1) list4.get(i17)).f32856e;
                                        if (xm1Var12 == null || z62.m13393u(xm1Var15.f34418a, xm1Var12.f34418a) >= 0) {
                                            int i18 = xm1Var15.f34418a;
                                            if (z62.m13393u(i18, i9) < 0) {
                                                if (xm1Var13 == null || z62.m13393u(i18, xm1Var13.f34418a) > 0) {
                                                    xm1Var13 = xm1Var15;
                                                }
                                            } else if (z62.m13393u(i18, i9) <= 0) {
                                                xm1Var13 = xm1Var15;
                                                xm1Var14 = xm1Var13;
                                                if (xm1Var14 != null) {
                                                    xm1Var13 = xm1Var14;
                                                }
                                                arrayList = new ArrayList(list4.size());
                                                size = list.size();
                                                for (i = 0; i < size; i++) {
                                                    obj2 = list4.get(i);
                                                    if (z62.m13387o(((vt1) obj2).f32856e, xm1Var13)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (xm1Var14 == null || z62.m13393u(i18, xm1Var14.f34418a) < 0) {
                                                xm1Var14 = xm1Var15;
                                            }
                                        }
                                    }
                                    if (xm1Var14 != null) {
                                        xm1Var13 = xm1Var14;
                                    }
                                    arrayList = new ArrayList(list4.size());
                                    size = list.size();
                                    while (i < size) {
                                        obj2 = list4.get(i);
                                        if (z62.m13387o(((vt1) obj2).f32856e, xm1Var13)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    jp0 jp0Var = im1Var.f21551a;
                    int size11 = arrayList.size();
                    int i19 = 0;
                    ArrayList arrayListM7699b0 = null;
                    while (true) {
                        if (i19 >= size11) {
                            l73Var = new l73(arrayListM7699b0, b71Var.invoke(fs4Var));
                        } else {
                            vt1 vt1Var2 = (vt1) arrayList.get(i19);
                            byte b6 = vt1Var2.f32852a;
                            if (b6 == 0) {
                                synchronized (((f70) jp0Var.f22483d)) {
                                    try {
                                        C1190tp c1190tp = new C1190tp(vt1Var2);
                                        C1153sp c1153sp2 = (C1153sp) ((bp2) jp0Var.f22481b).m3648c(c1190tp);
                                        if (c1153sp2 == null) {
                                            c1153sp2 = (C1153sp) ((lw2) jp0Var.f22482c).m8132g(c1190tp);
                                        }
                                        if (c1153sp2 != null) {
                                            objInvoke = c1153sp2.f30455a;
                                        } else {
                                            try {
                                                C0572de.m4487c(vt1Var2);
                                                objInvoke = null;
                                            } catch (Exception unused) {
                                                objInvoke = b71Var.invoke(fs4Var);
                                            }
                                            jp0.m7204J(jp0Var, vt1Var2, c0572de, objInvoke);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (objInvoke == null) {
                                    objInvoke = b71Var.invoke(fs4Var);
                                }
                                l73Var = new l73(arrayListM7699b0, vd6.m11837U(fs4Var.f19252d, objInvoke, vt1Var2, fs4Var.f19250b, fs4Var.f19251c));
                            } else {
                                if (b6 != 1) {
                                    if (b6 == 2) {
                                        jp0Var.getClass();
                                        C1190tp c1190tp2 = new C1190tp(vt1Var2);
                                        synchronized (((f70) jp0Var.f22483d)) {
                                            c1153sp = (C1153sp) ((bp2) jp0Var.f22481b).m3648c(c1190tp2);
                                            if (c1153sp == null) {
                                                c1153sp = (C1153sp) ((lw2) jp0Var.f22482c).m8132g(c1190tp2);
                                            }
                                            break;
                                        }
                                        if (c1153sp != null) {
                                            Object obj9 = c1153sp.f30455a;
                                            if (obj9 != null) {
                                                l73Var = new l73(arrayListM7699b0, vd6.m11837U(fs4Var.f19252d, obj9, vt1Var2, fs4Var.f19250b, fs4Var.f19251c));
                                            }
                                        } else if (arrayListM7699b0 == null) {
                                            arrayListM7699b0 = kx5.m7699b0(vt1Var2);
                                        } else {
                                            arrayListM7699b0.add(vt1Var2);
                                        }
                                        i19++;
                                    } else {
                                        wb1.m12196p(vt1Var2, "Unknown font type ");
                                    }
                                    return null;
                                }
                                synchronized (((f70) jp0Var.f22483d)) {
                                    try {
                                        C1190tp c1190tp3 = new C1190tp(vt1Var2);
                                        C1153sp c1153sp3 = (C1153sp) ((bp2) jp0Var.f22481b).m3648c(c1190tp3);
                                        if (c1153sp3 == null) {
                                            c1153sp3 = (C1153sp) ((lw2) jp0Var.f22482c).m8132g(c1190tp3);
                                        }
                                        if (c1153sp3 != null) {
                                            objM7389n = c1153sp3.f30455a;
                                        } else {
                                            try {
                                                C0572de.m4487c(vt1Var2);
                                                objM7389n = null;
                                            } catch (Throwable th3) {
                                                objM7389n = k43.m7389n(th3);
                                            }
                                            if (objM7389n != null) {
                                                objM7389n = null;
                                            }
                                            jp0.m7204J(jp0Var, vt1Var2, c0572de, objM7389n);
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                if (objM7389n != null) {
                                    l73Var = new l73(arrayListM7699b0, vd6.m11837U(fs4Var.f19252d, objM7389n, vt1Var2, fs4Var.f19250b, fs4Var.f19251c));
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                    List list8 = (List) l73Var.f23833a;
                    Object obj10 = l73Var.f23834b;
                    if (list8 == null) {
                        hs4Var = new hs4(obj10, true);
                    } else {
                        jp0 jp0Var2 = im1Var.f21551a;
                        C1375yo c1375yo = new C1375yo();
                        c1375yo.f35374a = list8;
                        c1375yo.f35375b = fs4Var;
                        c1375yo.f35376c = jp0Var2;
                        c1375yo.f35377d = yp1Var2;
                        c1375yo.f35378e = c0572de;
                        c1375yo.f35379f = k43.m7398w(obj10);
                        c1375yo.f35380g = true;
                        VarHandle.storeStoreFence();
                        lb5.m7910S(im1Var.f21552b, null, cp0.f16328d, new C0982og((Object) c1375yo, (wm0) null, (byte) 9), 1);
                        gs4Var = new gs4();
                        gs4Var.f20097a = c1375yo;
                        VarHandle.storeStoreFence();
                    }
                } else {
                    obj5 = null;
                }
                if (obj5 != null) {
                    obj5 = gs4Var;
                    obj5 = hs4Var;
                    return obj5;
                }
                obj5 = gs4Var;
                obj5 = hs4Var;
                r50 r50Var = (r50) cm1Var.f16125e.f33090b;
                bm1 bm1Var2 = fs4Var.f19249a;
                int i20 = fs4Var.f19251c;
                xm1 xm1Var16 = fs4Var.f19250b;
                if (bm1Var2 != null && !(bm1Var2 instanceof bw0)) {
                    if (bm1Var2 instanceof yr1) {
                        r50Var.getClass();
                        typefaceM10206g = r50.m10206g(((yr1) bm1Var2).f35479d, xm1Var16, i20);
                    } else {
                        hs4Var2 = null;
                    }
                    if (hs4Var2 != null) {
                        return hs4Var2;
                    }
                    C1077qn.m9989o("Could not load font");
                    return null;
                }
                r50Var.getClass();
                typefaceM10206g = r50.m10206g(null, xm1Var16, i20);
                hs4Var2 = new hs4(typefaceM10206g, true);
                if (hs4Var2 != null) {
                    return hs4Var2;
                }
                C1077qn.m9989o("Could not load font");
                return null;
            case 6:
                C0910mi c0910mi = (C0910mi) this.f25595b;
                C0910mi c0910mi2 = (C0910mi) this.f25596c;
                jp3 jp3Var2 = (jp3) obj;
                jp3Var2.m7257k(((Number) c0910mi.m8328d()).floatValue());
                jp3Var2.m7258l(((Number) c0910mi.m8328d()).floatValue());
                jp3Var2.m7253b(((Number) c0910mi2.m8328d()).floatValue());
                return ju4.f22634a;
            case 7:
                ((yu1) this.f25595b).f35528b.removeCallbacks((RunnableC1285w9) this.f25596c);
                return ju4.f22634a;
            case 8:
                i32 i32Var = (i32) this.f25595b;
                f32 f32Var = (f32) this.f25596c;
                i32Var.f21094a.m11663b(f32Var);
                i32Var.f21095b.setValue(Boolean.TRUE);
                C0562d4 c0562d5 = new C0562d4(b);
                c0562d5.f16768b = i32Var;
                c0562d5.f16769c = f32Var;
                VarHandle.storeStoreFence();
                return c0562d5;
            case 9:
                vi2 vi2Var = (vi2) this.f25595b;
                Object obj11 = this.f25596c;
                vi2Var.f32646c.m8417i(obj11);
                C0562d4 c0562d6 = new C0562d4((byte) 10);
                c0562d6.f16768b = vi2Var;
                c0562d6.f16769c = obj11;
                VarHandle.storeStoreFence();
                return c0562d6;
            case 10:
                return new vi2((lu3) this.f25595b, (Map) obj, (iu3) this.f25596c);
            case 11:
                sw2 sw2Var2 = (sw2) this.f25596c;
                xb4 xb4Var = (xb4) this.f25595b;
                vg2 vg2Var = (vg2) obj;
                C1039pm c1039pm = new C1039pm(b4);
                c1039pm.f27741b = sw2Var2;
                VarHandle.storeStoreFence();
                oi2.m9121c(vg2Var, null, new pg0(1445113176, true, c1039pm), 3);
                for (rn2 rn2Var : (List) xb4Var.getValue()) {
                    g32 g32Var = new g32((byte) 8);
                    g32Var.f19558b = rn2Var;
                    VarHandle.storeStoreFence();
                    C0928n c0928n = new C0928n(b2);
                    c0928n.f25353b = rn2Var;
                    VarHandle.storeStoreFence();
                    oi2.m9121c(vg2Var, g32Var, new pg0(-463476529, true, c0928n), 2);
                }
                return ju4.f22634a;
            case 12:
                MediaController mediaController = (MediaController) this.f25595b;
                or2 or2Var = new or2((sw2) this.f25596c);
                mediaController.registerCallback(or2Var);
                C0562d4 c0562d7 = new C0562d4(b2);
                c0562d7.f16768b = mediaController;
                c0562d7.f16769c = or2Var;
                VarHandle.storeStoreFence();
                return c0562d7;
            case 13:
                ((dv2) this.f25595b).m4748u((y14) this.f25596c, obj);
                return ju4.f22634a;
            case 14:
                sw2 sw2Var3 = (sw2) this.f25596c;
                sw2 sw2Var4 = (sw2) this.f25595b;
                b33 b33Var = (b33) obj;
                sw2Var3.setValue(b33.m3423a(b33Var.f15059a));
                ((pq1) sw2Var4.getValue()).mo6994d(null, b33.m3423a(0L), new es1(0.0f), null, b33Var);
                return ju4.f22634a;
            case 15:
                C0910mi c0910mi3 = (C0910mi) this.f25595b;
                xb4 xb4Var2 = (xb4) this.f25596c;
                jp3 jp3Var3 = (jp3) obj;
                jp3Var3.m7253b(((Number) c0910mi3.m8328d()).floatValue());
                jp3Var3.m7256j(((Number) xb4Var2.getValue()).floatValue());
                return ju4.f22634a;
            case 16:
                ((t82) this.f25595b).mo4993a(null);
                ((mg3) this.f25596c).mo5493n((ql0) obj);
                return ju4.f22634a;
            case 17:
                e33 e33Var = (e33) this.f25595b;
                db3 db3Var = (db3) this.f25596c;
                cb3 cb3Var = (cb3) obj;
                long j = ((o52) e33Var.f17663o.invoke(cb3Var)).f26352a;
                if (e33Var.f17664p) {
                    cb3.m3945s(cb3Var, db3Var, (int) (j >> 32), (int) (j & 4294967295L));
                } else {
                    cb3.m3946u(cb3Var, db3Var, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return ju4.f22634a;
            case 18:
                c73 c73Var = (c73) this.f25595b;
                db3 db3Var2 = (db3) this.f25596c;
                cb3 cb3Var2 = (cb3) obj;
                boolean z2 = c73Var.f15859s;
                float f = c73Var.f15855o;
                if (z2) {
                    cb3.m3944n(cb3Var2, db3Var2, cb3Var2.mo3579U(f), cb3Var2.mo3579U(c73Var.f15856p));
                } else {
                    cb3Var2.m3952k(db3Var2, cb3Var2.mo3579U(f), cb3Var2.mo3579U(c73Var.f15856p), 0.0f);
                }
                return ju4.f22634a;
            case 19:
                C1283w7 c1283w7 = (C1283w7) this.f25595b;
                rc3 rc3Var = (rc3) this.f25596c;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    c1283w7.f33128d = ((Boolean) ((C1256vh) rc3Var.m10293c()).invoke(motionEvent)).booleanValue() ? qc3.f28384b : qc3.f28385c;
                } else {
                    ((C1256vh) rc3Var.m10293c()).invoke(motionEvent);
                }
                return ju4.f22634a;
            case 20:
                C1345xv c1345xv = (C1345xv) this.f25595b;
                th0 th0Var = (th0) this.f25596c;
                c1345xv.m12759a(th0Var);
                C0562d4 c0562d8 = new C0562d4((byte) 14);
                c0562d8.f16768b = c1345xv;
                c0562d8.f16769c = th0Var;
                VarHandle.storeStoreFence();
                return c0562d8;
            case 21:
                ((td3) this.f25595b).f31090b.m13540A((ve4) obj, (sd3) this.f25596c);
                return ju4.f22634a;
            case 22:
                ye3 ye3Var = (ye3) this.f25595b;
                g44 g44Var = (g44) this.f25596c;
                vg2 vg2Var2 = (vg2) obj;
                re3 re3Var = new re3(z ? 1 : 0);
                re3Var.f29211b = g44Var;
                VarHandle.storeStoreFence();
                oi2.m9121c(vg2Var2, null, new pg0(1915793052, true, re3Var), 3);
                if (!((Boolean) g44Var.getValue()).booleanValue() && z62.m13387o(ye3Var.mo9873f(), Boolean.TRUE)) {
                    C0928n c0928n2 = new C0928n((byte) 18);
                    c0928n2.f25353b = ye3Var;
                    VarHandle.storeStoreFence();
                    oi2.m9121c(vg2Var2, null, new pg0(445090359, true, c0928n2), 3);
                }
                return ju4.f22634a;
            case 23:
                zi0 zi0Var = (zi0) this.f25595b;
                mw2 mw2Var = (mw2) this.f25596c;
                zi0Var.m13572A(obj);
                if (mw2Var != null) {
                    mw2Var.m8409a(obj);
                }
                return ju4.f22634a;
            case 24:
                el3 el3Var = (el3) this.f25595b;
                Throwable th5 = (Throwable) this.f25596c;
                Throwable th6 = (Throwable) obj;
                synchronized (el3Var.f18216c) {
                    if (th5 == null) {
                        th5 = null;
                    } else if (th6 != null) {
                        try {
                            if (th6 instanceof CancellationException) {
                                th6 = null;
                            }
                            if (th6 != null) {
                                se0.m10720f(th5, th6);
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    el3Var.f18218e = th5;
                    ac4 ac4Var = el3Var.f18234u;
                    cl3 cl3Var = cl3.f16099a;
                    ac4Var.getClass();
                    ac4Var.m200k(null, cl3Var);
                }
                return ju4.f22634a;
            case 25:
                lk2 lk2Var = (lk2) this.f25595b;
                mh0 mh0Var = (mh0) this.f25596c;
                C0749i4 c0749i4 = new C0749i4(b5);
                c0749i4.f21112b = mh0Var;
                VarHandle.storeStoreFence();
                if (lk2Var != null && (lifecycle = lk2Var.getLifecycle()) != null) {
                    lifecycle.mo6015a(c0749i4);
                }
                if (lk2Var == null) {
                    ek2 ek2Var = ek2.ON_RESUME;
                    mh0Var.getClass();
                    mh0Var.f24911b = ek2Var.m5149a();
                    mh0Var.m8322a();
                }
                C0785j4 c0785j4 = new C0785j4(b3);
                c0785j4.f21995c = lk2Var;
                c0785j4.f21994b = c0749i4;
                c0785j4.f21996d = mh0Var;
                VarHandle.storeStoreFence();
                return c0785j4;
            case 26:
                ww2 ww2Var = (ww2) this.f25595b;
                a05 a05Var = (a05) this.f25596c;
                ob1 ob1Var = new ob1();
                ob1Var.f26536a = a05Var;
                ob1Var.f26537b = (a05) obj;
                VarHandle.storeStoreFence();
                ww2Var.f33799a.setValue(ob1Var);
                return ju4.f22634a;
            case 27:
                a44 a44Var = (a44) this.f25595b;
                rn3 rn3Var = (rn3) this.f25596c;
                vg2 vg2Var3 = (vg2) obj;
                List listM12433a = wx2.m12433a(a44Var);
                fv3 fv3Var = new fv3((byte) 20);
                fv3 fv3Var2 = new fv3((byte) 21);
                fv3 fv3Var3 = new fv3((byte) 22);
                ch0 ch0Var = new ch0(b4);
                ch0Var.f16014b = a44Var;
                VarHandle.storeStoreFence();
                ch0 ch0Var2 = new ch0((byte) 4);
                ch0Var2.f16014b = a44Var;
                VarHandle.storeStoreFence();
                zg0 zg0Var = new zg0((byte) 5);
                zg0Var.f36059b = a44Var;
                VarHandle.storeStoreFence();
                for (Object obj12 : listM12433a) {
                    int i21 = i4 + 1;
                    if (i4 < 0) {
                        Throwable th8 = th;
                        kx5.m7735t0();
                        throw th8;
                    }
                    nt4 nt4Var = new nt4();
                    nt4Var.f26081a = fv3Var;
                    nt4Var.f26082b = i4;
                    VarHandle.storeStoreFence();
                    Throwable th9 = th;
                    ot4 ot4Var = new ot4();
                    ot4Var.f27092a = obj12;
                    ot4Var.f27093b = rn3Var;
                    ot4Var.f27094c = fv3Var2;
                    ot4Var.f27095d = ch0Var;
                    ot4Var.f27096e = i4;
                    ot4Var.f27097f = fv3Var3;
                    ot4Var.f27098g = ch0Var2;
                    VarHandle.storeStoreFence();
                    mz3.m8468j(vg2Var3, new pg0(-1430316350, true, nt4Var), i4 + "_header", ot4Var);
                    i4 = i21;
                    th = th9;
                }
                kt4 kt4Var = new kt4(b5);
                kt4Var.f23431b = zg0Var;
                VarHandle.storeStoreFence();
                oi2.m9121c(vg2Var3, "add_button", new pg0(-1071055675, true, kt4Var), 2);
                return ju4.f22634a;
            case 28:
                xn2 xn2Var2 = (xn2) this.f25595b;
                ac4 ac4Var2 = (ac4) this.f25596c;
                AccessibilityEvent accessibilityEvent = (AccessibilityEvent) obj;
                if (xn2Var2 != null) {
                    String strM12721a2 = xn2Var2.m12721a();
                    k44 k44Var2 = k44.f22883b;
                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                        xn2Var2.m12722b(k44Var2, strM12721a2, "on event " + accessibilityEvent, null);
                    }
                }
                int i22 = ((ux3) ac4Var2.getValue()).f32233a + 1;
                r50 r50Var2 = i41.f21117b;
                ac4Var2.m200k(null, new ux3(i22, accessibilityEvent.getFromIndex(), accessibilityEvent.getScrollY(), as4.m3239R(SystemClock.uptimeMillis(), m41.MILLISECONDS)));
                return ju4.f22634a;
            default:
                ty3 ty3Var = (ty3) this.f25595b;
                vy3 vy3Var = (vy3) this.f25596c;
                e21 e21Var = (e21) obj;
                float f2 = e21Var.f17639b ? -1.0f : 1.0f;
                long j2 = e21Var.f17638a;
                ty3Var.m11196a(1, b33.m3431i(vy3Var.f32961d == d63.f16815b ? b33.m3424b(j2, 0.0f, 1) : b33.m3424b(j2, 0.0f, 2), f2));
                return ju4.f22634a;
        }
    }
}
