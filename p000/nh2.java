package p000;

import android.os.Build;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh2 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25804a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25805b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25806c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f25807d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f25808e;

    public /* synthetic */ nh2(byte b) {
        this.f25804a = b;
    }

    /* JADX WARN: Code duplicated, block: B:300:0x0a0c  */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        float refreshRate;
        Object obj5;
        boolean z;
        zx2 zx2Var;
        zx2 zx2Var2;
        xb4 xb4Var;
        boolean zM9352c;
        int i;
        boolean z2;
        C0853kz c0853kz;
        byte b;
        Object obj6;
        p91 p91Var;
        mc1 mc1Var;
        Object obj7;
        Object obj8;
        xn2 xn2Var;
        boolean z3;
        byte b2 = this.f25804a;
        da2 da2Var = wf2.f33290T;
        nt2 nt2VarM5544o = kt2.f23428a;
        ju4 ju4Var = ju4.f22634a;
        byte b3 = 2;
        Object obj9 = ki0.f23136a;
        wm0 wm0Var = null;
        switch (b2) {
            case 0:
                vh2 vh2Var = (vh2) this.f25807d;
                nt2 nt2Var = (nt2) this.f25805b;
                Object obj10 = (li2) this.f25808e;
                sw2 sw2Var = (sw2) this.f25806c;
                gu3 gu3Var = (gu3) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj2);
                Object objM6869O = ir1Var.m6869O();
                Object obj11 = objM6869O;
                if (objM6869O == obj9) {
                    C0725hh c0725hh = new C0725hh((byte) 10);
                    c0725hh.f20571b = sw2Var;
                    VarHandle.storeStoreFence();
                    lh2 lh2Var = new lh2();
                    lh2Var.f24032a = gu3Var;
                    lh2Var.f24033b = c0725hh;
                    long[] jArr = tv3.f31472a;
                    lh2Var.f24034c = new lw2();
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(lh2Var);
                    obj11 = lh2Var;
                }
                Object obj12 = (lh2) obj11;
                Object objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == obj9) {
                    z32 z32Var = new z32((byte) 18);
                    z32Var.f35738b = obj12;
                    yv2 yv2Var = p23.f27324a;
                    z32Var.f35739c = new yv2();
                    VarHandle.storeStoreFence();
                    objM6869O2 = new ee4(z32Var);
                    ir1Var.m6905n0(objM6869O2);
                }
                ee4 ee4Var = (ee4) objM6869O2;
                if (vh2Var != null) {
                    ir1Var.m6885d0(1743490539);
                    ir1Var.m6885d0(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        ir1Var.m6885d0(1345729441);
                        View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
                        boolean zM6890g = ir1Var.m6890g(view);
                        Object objM6869O3 = ir1Var.m6869O();
                        Object obj13 = objM6869O3;
                        if (zM6890g || objM6869O3 == obj9) {
                            Object tag = view.getTag(C0995R.id.compose_prefetch_scheduler);
                            Object obj14 = tag instanceof ke3 ? (ke3) tag : null;
                            if (obj14 == null) {
                                ViewOnAttachStateChangeListenerC1329xf viewOnAttachStateChangeListenerC1329xf = new ViewOnAttachStateChangeListenerC1329xf();
                                viewOnAttachStateChangeListenerC1329xf.f34213a = view;
                                viewOnAttachStateChangeListenerC1329xf.f34214b = new PriorityQueue(11, new C1254vf((byte) 0));
                                viewOnAttachStateChangeListenerC1329xf.f34216d = Choreographer.getInstance();
                                viewOnAttachStateChangeListenerC1329xf.f34217e = new C1291wf();
                                if (ViewOnAttachStateChangeListenerC1329xf.f34212h == 0) {
                                    Display display = view.getDisplay();
                                    if (view.isInEditMode() || display == null) {
                                        refreshRate = 60.0f;
                                    } else {
                                        refreshRate = display.getRefreshRate();
                                        if (refreshRate < 30.0f) {
                                            refreshRate = 60.0f;
                                        }
                                    }
                                    ViewOnAttachStateChangeListenerC1329xf.f34212h = (long) (1.0E9f / refreshRate);
                                }
                                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1329xf);
                                if (view.isAttachedToWindow()) {
                                    viewOnAttachStateChangeListenerC1329xf.f34218f = true;
                                }
                                VarHandle.storeStoreFence();
                                view.setTag(C0995R.id.compose_prefetch_scheduler, viewOnAttachStateChangeListenerC1329xf);
                                obj4 = viewOnAttachStateChangeListenerC1329xf;
                            } else {
                                obj4 = obj14;
                            }
                            ir1Var.m6905n0(obj4);
                            obj13 = obj4;
                        }
                        obj5 = (ke3) obj13;
                        z = false;
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(1345548711);
                        Object objM6869O4 = ir1Var.m6869O();
                        if (objM6869O4 == obj9) {
                            objM6869O4 = new le3();
                            ir1Var.m6905n0(objM6869O4);
                        }
                        obj5 = (le3) objM6869O4;
                        z = false;
                        ir1Var.m6912r(false);
                    }
                    ir1Var.m6912r(z);
                    Object[] objArr = {vh2Var, obj12, ee4Var, obj5};
                    boolean zM6890g2 = ir1Var.m6890g(vh2Var) | ir1Var.m6894i(obj12) | ir1Var.m6894i(ee4Var) | ir1Var.m6894i(obj5);
                    Object objM6869O5 = ir1Var.m6869O();
                    Object obj15 = objM6869O5;
                    if (zM6890g2 || objM6869O5 == obj9) {
                        C0762ii c0762ii = new C0762ii((byte) 8);
                        c0762ii.f21430b = vh2Var;
                        c0762ii.f21431c = obj12;
                        c0762ii.f21432d = ee4Var;
                        c0762ii.f21433e = obj5;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0762ii);
                        obj15 = c0762ii;
                    }
                    yp1 yp1Var = (yp1) obj15;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
                    boolean zM6886e = ir1Var.m6886e(objArrCopyOf.length);
                    for (Object obj16 : objArrCopyOf) {
                        zM6886e |= ir1Var.m6890g(obj16);
                    }
                    Object objM6869O6 = ir1Var.m6869O();
                    if (zM6886e || objM6869O6 == obj9) {
                        ir1Var.m6905n0(new s01(yp1Var));
                    }
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(1744076749);
                    ir1Var.m6912r(false);
                }
                int i2 = wh2.f33384a;
                if (vh2Var != null) {
                    qp4 qp4Var = new qp4();
                    qp4Var.f28675a = vh2Var;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarMo7630d = nt2Var.mo7630d(qp4Var);
                    if (nt2VarMo7630d != null) {
                        nt2Var = nt2VarMo7630d;
                    }
                }
                boolean zM6890g3 = ir1Var.m6890g(obj12) | ir1Var.m6890g(obj10);
                Object objM6869O7 = ir1Var.m6869O();
                Object obj17 = objM6869O7;
                if (zM6890g3 || objM6869O7 == obj9) {
                    er1 er1Var = new er1((byte) 4);
                    er1Var.f18412b = obj12;
                    er1Var.f18413c = obj10;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(er1Var);
                    obj17 = er1Var;
                }
                ae4.m2949b(ee4Var, nt2Var, (mq1) obj17, ir1Var, 8);
                return ju4Var;
            case 1:
                nt2 nt2Var2 = (nt2) this.f25805b;
                sw2 sw2Var2 = (sw2) this.f25806c;
                xb4 xb4Var2 = (xb4) this.f25807d;
                pg0 pg0Var = (pg0) this.f25808e;
                yg4 yg4Var = (yg4) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                C0853kz c0853kz2 = ig1.f21378b;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(yg4Var) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var;
                if (!ir1Var2.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var2.m6874W();
                    return ju4Var;
                }
                WeakHashMap weakHashMap = y05.f34773x;
                s11 s11VarM13777h = zt5.m13777h(k43.m7390o(ir1Var2).f34781h, ir1Var2);
                float f = s11VarM13777h.f29820c;
                float f2 = s11VarM13777h.f29818a;
                float f3 = s11VarM13777h.f29821d;
                if (p11.m9351b(f3, 0.0f) > 0) {
                    zx2Var = new zx2(yx2.f35586c, f3);
                } else {
                    if (p11.m9351b(f2, 0.0f) > 0) {
                        zx2Var2 = new zx2(yx2.f35584a, f2);
                    } else if (p11.m9351b(f, 0.0f) > 0) {
                        zx2Var2 = new zx2(yx2.f35585b, f);
                    } else {
                        zx2Var = null;
                    }
                    zx2Var = zx2Var2;
                }
                if (zx2Var == null) {
                    return ju4Var;
                }
                yx2 yx2Var = zx2Var.f36443a;
                float f4 = zx2Var.f36444b;
                s11 s11VarM13777h2 = zt5.m13777h(k43.m7390o(ir1Var2).f34780g, ir1Var2);
                int iOrdinal = yx2Var.ordinal();
                if (iOrdinal != 0) {
                    xb4Var = xb4Var2;
                    if (iOrdinal == 1) {
                        zM9352c = p11.m9352c(s11VarM13777h2.f29820c, 0.0f);
                    } else {
                        if (iOrdinal != 2) {
                            C0670g.m5864c();
                            return null;
                        }
                        zM9352c = p11.m9352c(s11VarM13777h2.f29821d, 0.0f);
                    }
                } else {
                    xb4Var = xb4Var2;
                    zM9352c = p11.m9352c(s11VarM13777h2.f29818a, 0.0f);
                }
                sw2Var2.setValue(Boolean.valueOf(zM9352c));
                boolean z4 = ((Boolean) sw2Var2.getValue()).booleanValue() && !((Boolean) xb4Var.getValue()).booleanValue();
                float f5 = z4 ? f4 : 0.0f;
                int i3 = z4 ? 300 : 150;
                if (z4) {
                    ir1Var2.m6885d0(-910143505);
                    boolean zM4802a = se0.m10705T(ir1Var2).m4802a();
                    i = 0;
                    ir1Var2.m6912r(false);
                    z2 = zM4802a;
                } else {
                    i = 0;
                    ir1Var2.m6885d0(1850323654);
                    ir1Var2.m6912r(false);
                    z2 = false;
                }
                xb4 xb4VarM8765a = AbstractC0947ni.m8765a(f5, qq2.m10016K(i3, z2 ? 1000 : i, null, 4), ir1Var2);
                Object objM6869O8 = ir1Var2.m6869O();
                if (objM6869O8 == obj9) {
                    by2 by2Var = new by2((byte) 0);
                    by2Var.f15683b = xb4VarM8765a;
                    VarHandle.storeStoreFence();
                    objM6869O8 = s94.m10566b(by2Var);
                    ir1Var2.m6905n0(objM6869O8);
                }
                xb4 xb4Var3 = (xb4) objM6869O8;
                boolean z5 = yx2Var == yx2.f35586c;
                int iOrdinal2 = yx2Var.ordinal();
                if (iOrdinal2 == 0) {
                    c0853kz = c0853kz2;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            c0853kz = ig1.f21385i;
                        } else {
                            C0670g.m5864c();
                        }
                        return null;
                    }
                    c0853kz = ig1.f21380d;
                }
                nt2 nt2VarMo7630d2 = yg4.m13125c(yg4Var, c0853kz).mo7630d(z5 ? n74.m8575c(n74.m8574b(nt2VarM5544o, 1.0f), f4) : n74.m8583k(nt2VarM5544o, f4).mo7630d(n74.f25505b));
                boolean zM6890g4 = ir1Var2.m6890g(zx2Var);
                Object objM6869O9 = ir1Var2.m6869O();
                Object obj18 = objM6869O9;
                if (zM6890g4 || objM6869O9 == obj9) {
                    cy2 cy2Var = new cy2((byte) 0);
                    cy2Var.f16613b = xb4Var3;
                    cy2Var.f16614c = zx2Var;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(cy2Var);
                    obj18 = cy2Var;
                }
                nt2 nt2VarMo7630d3 = vd6.m11824H(nt2VarMo7630d2, (yp1) obj18).mo7630d(nt2Var2);
                ic2[] ic2VarArr = gh4.f19795a;
                hv1 hv1Var = new hv1((byte) 4);
                VarHandle.storeStoreFence();
                q20.m9702a(qq2.m10029m(nt2VarMo7630d3, hv1Var), ir1Var2, 0);
                lu2 lu2Var = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24280d;
                nt2 nt2VarMo7630d4 = yg4.m13125c(yg4Var, c0853kz).mo7630d(z5 ? n74.m8576d(n74.m8574b(nt2VarM5544o, 1.0f), f4, Float.NaN) : n74.m8584l(nt2VarM5544o, f4, 0.0f, 2).mo7630d(n74.f25505b));
                boolean zM6890g5 = ir1Var2.m6890g(zx2Var) | ir1Var2.m6890g(xb4VarM8765a);
                Object objM6869O10 = ir1Var2.m6869O();
                if (zM6890g5 || objM6869O10 == obj9) {
                    b = 1;
                    cy2 cy2Var2 = new cy2(b);
                    cy2Var2.f16613b = xb4VarM8765a;
                    cy2Var2.f16614c = zx2Var;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(cy2Var2);
                    obj6 = cy2Var2;
                } else {
                    b = 1;
                    obj6 = objM6869O10;
                }
                nt2 nt2VarM11824H = vd6.m11824H(nt2VarMo7630d4, (yp1) obj6);
                int iOrdinal3 = yx2Var.ordinal();
                if (iOrdinal3 == 0) {
                    ir1Var2.m6885d0(-910091575);
                    db4 db4VarMo7289f = lu2Var.mo7289f();
                    Object objM6869O11 = ir1Var2.m6869O();
                    if (objM6869O11 == obj9) {
                        objM6869O11 = new kr2((byte) 8);
                        ir1Var2.m6905n0(objM6869O11);
                    }
                    sq4 sq4Var = k91.f23003a;
                    p91Var = new p91(new cp4((xc1) null, new t74(new j91((yp1) objM6869O11, (byte) 0), db4VarMo7289f), (z70) null, (rv3) null, (LinkedHashMap) null, 125));
                    ir1Var2.m6912r(false);
                } else {
                    if (iOrdinal3 != b) {
                        if (iOrdinal3 == 2) {
                            ir1Var2.m6885d0(-910084538);
                            db4 db4VarMo7289f2 = lu2Var.mo7289f();
                            Object objM6869O12 = ir1Var2.m6869O();
                            if (objM6869O12 == obj9) {
                                objM6869O12 = new kr2((byte) 9);
                                ir1Var2.m6905n0(objM6869O12);
                            }
                            sq4 sq4Var2 = k91.f23003a;
                            p91Var = new p91(new cp4((xc1) null, new t74(new j91((yp1) objM6869O12, (byte) 1), db4VarMo7289f2), (z70) null, (rv3) null, (LinkedHashMap) null, 125));
                            ir1Var2.m6912r(false);
                        } else {
                            ir1Var2.m6885d0(-910093671);
                            ir1Var2.m6912r(false);
                            C0670g.m5864c();
                        }
                        return null;
                    }
                    ir1Var2.m6885d0(-910088056);
                    db4 db4VarMo7289f3 = lu2Var.mo7289f();
                    Object objM6869O13 = ir1Var2.m6869O();
                    if (objM6869O13 == obj9) {
                        objM6869O13 = new kr2((byte) 9);
                        ir1Var2.m6905n0(objM6869O13);
                    }
                    sq4 sq4Var3 = k91.f23003a;
                    p91Var = new p91(new cp4((xc1) null, new t74(new j91((yp1) objM6869O13, (byte) 0), db4VarMo7289f3), (z70) null, (rv3) null, (LinkedHashMap) null, 125));
                    ir1Var2.m6912r(false);
                }
                int iOrdinal4 = yx2Var.ordinal();
                if (iOrdinal4 == 0) {
                    ir1Var2.m6885d0(-910079478);
                    db4 db4VarMo7289f4 = lu2Var.mo7289f();
                    Object objM6869O14 = ir1Var2.m6869O();
                    if (objM6869O14 == obj9) {
                        objM6869O14 = new kr2((byte) 10);
                        ir1Var2.m6905n0(objM6869O14);
                    }
                    mc1Var = new mc1(new cp4((xc1) null, new t74(new j91((yp1) objM6869O14, (byte) 2), db4VarMo7289f4), (z70) null, (rv3) null, (LinkedHashMap) null, 125));
                    ir1Var2.m6912r(false);
                } else if (iOrdinal4 == 1) {
                    ir1Var2.m6885d0(-910075927);
                    db4 db4VarMo7289f5 = lu2Var.mo7289f();
                    Object objM6869O15 = ir1Var2.m6869O();
                    if (objM6869O15 == obj9) {
                        objM6869O15 = new kr2((byte) 9);
                        ir1Var2.m6905n0(objM6869O15);
                    }
                    mc1Var = new mc1(new cp4((xc1) null, new t74(new j91((yp1) objM6869O15, (byte) 2), db4VarMo7289f5), (z70) null, (rv3) null, (LinkedHashMap) null, 125));
                    ir1Var2.m6912r(false);
                } else {
                    if (iOrdinal4 != 2) {
                        ir1Var2.m6885d0(-910081572);
                        ir1Var2.m6912r(false);
                        C0670g.m5864c();
                        return null;
                    }
                    ir1Var2.m6885d0(-910072377);
                    db4 db4VarMo7289f6 = lu2Var.mo7289f();
                    Object objM6869O16 = ir1Var2.m6869O();
                    if (objM6869O16 == obj9) {
                        objM6869O16 = new kr2((byte) 9);
                        ir1Var2.m6905n0(objM6869O16);
                    }
                    mc1Var = new mc1(new cp4((xc1) null, new t74(new j91((yp1) objM6869O16, (byte) 3), db4VarMo7289f6), (z70) null, (rv3) null, (LinkedHashMap) null, 125));
                    ir1Var2.m6912r(false);
                }
                nt2 nt2VarMo2996a = yg4Var.mo2996a(nt2VarM11824H, p91Var, mc1Var);
                xq2 xq2VarM9704c = q20.m9704c(c0853kz2, true);
                int iHashCode = Long.hashCode(ir1Var2.f21683T);
                ga3 ga3VarM6902m = ir1Var2.m6902m();
                nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarMo2996a);
                bi0.f15310ap.getClass();
                if (ir1Var2.f21685a == null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var2.m6893h0();
                if (ir1Var2.f21682S) {
                    ir1Var2.m6900l(da2Var);
                } else {
                    ir1Var2.m6911q0();
                }
                C0006a5.m53I(ir1Var2, ia5.f21216g, xq2VarM9704c);
                C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
                C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
                C0006a5.m50F(ir1Var2);
                C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
                pg0Var.invoke(zx2Var, ir1Var2, 0);
                ir1Var2.m6912r(true);
                return ju4Var;
            case 2:
                List list = (List) this.f25807d;
                yp1 yp1Var2 = (yp1) this.f25805b;
                sw2 sw2Var3 = (sw2) this.f25806c;
                sw2 sw2Var4 = (sw2) this.f25808e;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var2;
                if (ir1Var3.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM6890g6 = ir1Var3.m6890g(list);
                    Object objM6869O17 = ir1Var3.m6869O();
                    if (zM6890g6 || objM6869O17 == obj9) {
                        obj7 = objM6869O17;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(ib0.m6717y0(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            long j = ((pb0) it.next()).f27503a;
                            arrayList.add(new b20());
                        }
                        ir1Var3.m6905n0(arrayList);
                        obj7 = arrayList;
                    }
                    List list3 = (List) obj7;
                    nt2 nt2VarM5653K = AbstractC0647fd.m5653K(kt2.f23428a, 24.0f, 0.0f, 24.0f, 16.0f, 2);
                    C1225un c1225unM12718d = AbstractC1337xn.m12718d(8.0f);
                    boolean zM6890g7 = ir1Var3.m6890g(list) | ir1Var3.m6892h(false) | ir1Var3.m6890g(yp1Var2) | ir1Var3.m6890g(list3);
                    Object objM6869O18 = ir1Var3.m6869O();
                    Object obj19 = objM6869O18;
                    if (zM6890g7 || objM6869O18 == obj9) {
                        C0869le c0869le = new C0869le(b3);
                        c0869le.f23968b = list;
                        c0869le.f23972f = yp1Var2;
                        c0869le.f23969c = list3;
                        c0869le.f23970d = sw2Var3;
                        c0869le.f23971e = sw2Var4;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c0869le);
                        obj19 = c0869le;
                    }
                    as4.m3247f(nt2VarM5653K, null, null, c1225unM12718d, null, (yp1) obj19, ir1Var3, 3078);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 3:
                nt2 nt2Var3 = (nt2) this.f25805b;
                si2 si2Var = (si2) this.f25807d;
                String str2 = (String) this.f25808e;
                yp1 yp1Var3 = (yp1) this.f25806c;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                byte b4 = 1;
                ir1 ir1Var4 = (ir1) mi0Var3;
                if (ir1Var4.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nt2 nt2VarM10029m = qq2.m10029m(nt2Var3, new hv1(b4));
                    boolean zM6890g8 = ir1Var4.m6890g(str2) | ir1Var4.m6890g(yp1Var3);
                    Object objM6869O19 = ir1Var4.m6869O();
                    if (zM6890g8 || objM6869O19 == obj9) {
                        obj8 = objM6869O19;
                        C0558d0 c0558d0 = new C0558d0((byte) 23);
                        c0558d0.f16655b = str2;
                        c0558d0.f16656c = yp1Var3;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0558d0);
                        obj8 = c0558d0;
                    }
                    as4.m3246e(nt2VarM10029m, si2Var, null, null, null, (yp1) obj8, ir1Var4, 0);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 4:
                lf0 lf0Var = (lf0) this.f25807d;
                yp1 yp1Var4 = (yp1) this.f25805b;
                oq1 oq1Var = (oq1) this.f25808e;
                nq1 nq1Var = (nq1) this.f25806c;
                ((Integer) obj3).getClass();
                ir1 ir1Var5 = (ir1) ((mi0) obj2);
                ir1Var5.m6885d0(-1414085295);
                wp1 wp1Var = (wp1) ir1Var5.m6898k(hj0.f20619a);
                lv1 lv1Var = (lv1) ir1Var5.m6898k(nv1.f26110a);
                xn2 xn2Var2 = (xn2) ir1Var5.m6898k(yn2.f35357b);
                if (xn2Var2 == null) {
                    ir1Var5.m6885d0(-1476823888);
                    ir1Var5.m6912r(false);
                    xn2Var = null;
                } else {
                    ir1Var5.m6885d0(-1476823887);
                    boolean zM6890g9 = ir1Var5.m6890g("ComplexSwipeDetector") | ir1Var5.m6890g(xn2Var2);
                    Object objM6869O20 = ir1Var5.m6869O();
                    if (zM6890g9 || objM6869O20 == obj9) {
                        objM6869O20 = xn2Var2.m12723c("ComplexSwipeDetector");
                        ir1Var5.m6905n0(objM6869O20);
                    }
                    xn2Var = (xn2) objM6869O20;
                    ir1Var5.m6912r(false);
                }
                Set set = lf0Var.f23991a;
                boolean zM6894i = ir1Var5.m6894i(xn2Var) | ir1Var5.m6890g(lf0Var) | ir1Var5.m6890g(yp1Var4) | ir1Var5.m6890g(wp1Var) | ir1Var5.m6890g(lv1Var) | ir1Var5.m6884d(96.0f) | ir1Var5.m6884d(32.0f) | ir1Var5.m6890g(oq1Var) | ir1Var5.m6890g(nq1Var);
                Object objM6869O21 = ir1Var5.m6869O();
                Object obj20 = objM6869O21;
                if (zM6894i || objM6869O21 == obj9) {
                    jf0 jf0Var = new jf0();
                    jf0Var.f22202a = xn2Var;
                    jf0Var.f22203b = lf0Var;
                    jf0Var.f22204c = yp1Var4;
                    jf0Var.f22205d = oq1Var;
                    jf0Var.f22206e = nq1Var;
                    jf0Var.f22207f = wp1Var;
                    jf0Var.f22208g = lv1Var;
                    VarHandle.storeStoreFence();
                    ir1Var5.m6905n0(jf0Var);
                    obj20 = jf0Var;
                }
                nt2 nt2VarM10327a = rf4.m10327a(nt2VarM5544o, set, (PointerInputEventHandler) obj20);
                ir1Var5.m6912r(false);
                return nt2VarM10327a;
            case 5:
                mq1 mq1Var = (mq1) this.f25807d;
                pm0 pm0Var = (pm0) this.f25805b;
                nq1 nq1Var2 = (nq1) this.f25808e;
                wp1 wp1Var2 = (wp1) this.f25806c;
                om0 om0Var = (om0) obj;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((ir1) mi0Var4).m6890g(om0Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var6 = (ir1) mi0Var4;
                if (ir1Var6.m6871T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    String str3 = (String) mq1Var.invoke(ir1Var6, 0);
                    if (hd4.m6345k0(str3)) {
                        t32.m10970c("Label must not be blank");
                    }
                    pm0Var.getClass();
                    z62.f35780b.mo9512a(str3, Boolean.TRUE, om0Var, nq1Var2, wp1Var2, ir1Var6, Integer.valueOf((iIntValue4 << 9) & 7168));
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 6:
                mq1 mq1Var2 = (mq1) this.f25807d;
                e73 e73Var = (e73) this.f25805b;
                mq1 mq1Var3 = (mq1) this.f25808e;
                pg0 pg0Var2 = (pg0) this.f25806c;
                e73 e73Var2 = (e73) obj;
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((ir1) mi0Var5).m6890g(e73Var2) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var7 = (ir1) mi0Var5;
                if (ir1Var7.m6871T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    nc4 nc4Var = ij0.f21479n;
                    nt2 nt2VarM5653K2 = AbstractC0647fd.m5653K(kt2.f23428a, AbstractC0647fd.m5681t(e73Var2, (df2) ir1Var7.m6898k(nc4Var)), 0.0f, AbstractC0647fd.m5680s(e73Var2, (df2) ir1Var7.m6898k(nc4Var)), 0.0f, 10);
                    xq2 xq2VarM9704c2 = q20.m9704c(ig1.f21378b, false);
                    int iHashCode2 = Long.hashCode(ir1Var7.f21683T);
                    ga3 ga3VarM6902m2 = ir1Var7.m6902m();
                    nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var7, nt2VarM5653K2);
                    bi0.f15310ap.getClass();
                    if (ir1Var7.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var7.m6893h0();
                    if (ir1Var7.f21682S) {
                        ir1Var7.m6900l(da2Var);
                    } else {
                        ir1Var7.m6911q0();
                    }
                    C0006a5.m53I(ir1Var7, ia5.f21216g, xq2VarM9704c2);
                    C0006a5.m53I(ir1Var7, ia5.f21215f, ga3VarM6902m2);
                    C0006a5.m53I(ir1Var7, ia5.f21217h, Integer.valueOf(iHashCode2));
                    C0006a5.m50F(ir1Var7);
                    C0006a5.m53I(ir1Var7, ia5.f21214e, nt2VarM10006A2);
                    as4.m3244c(ra1.f29113a.mo7523a(new g73(AbstractC0647fd.m5681t(e73Var2, (df2) ir1Var7.m6898k(nc4Var)), e73Var2.mo3505d() + (mq1Var2 == null ? e73Var.mo3505d() : 0.0f), AbstractC0647fd.m5680s(e73Var2, (df2) ir1Var7.m6898k(nc4Var)), e73Var2.mo3504c() + (mq1Var3 == null ? e73Var.mo3504c() : 0.0f))), pg0Var2, ir1Var7, 8);
                    ir1Var7.m6912r(true);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            default:
                ga4 ga4Var = (ga4) this.f25807d;
                uj2 uj2Var = (uj2) this.f25805b;
                xk4 xk4Var = (xk4) this.f25808e;
                vi3 vi3Var = (vi3) this.f25806c;
                nt2 nt2Var4 = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var8 = (ir1) ((mi0) obj2);
                ir1Var8.m6885d0(-84507373);
                boolean zBooleanValue = ((Boolean) ir1Var8.m6898k(ij0.f21490y)).booleanValue();
                boolean zM6892h = ir1Var8.m6892h(zBooleanValue);
                Object objM6869O22 = ir1Var8.m6869O();
                Object obj21 = objM6869O22;
                if (zM6892h || objM6869O22 == obj9) {
                    es0 es0Var = new es0();
                    es0Var.f18427a = zBooleanValue;
                    es0Var.f18428b = new AtomicReference(null);
                    es0Var.f18429c = new z73(0.0f);
                    VarHandle.storeStoreFence();
                    ir1Var8.m6905n0(es0Var);
                    obj21 = es0Var;
                }
                es0 es0Var2 = (es0) obj21;
                boolean z6 = ga4Var.f19691a != 16;
                if (((cj2) ((yz4) ir1Var8.m6898k(ij0.f21486u))).m4033a() && uj2Var.m11575b() && ql4.m9900d(xk4Var.f34342b) && z6) {
                    ir1Var8.m6885d0(-707487962);
                    C0875lk c0875lk = xk4Var.f34341a;
                    ql4 ql4VarM9897a = ql4.m9897a(xk4Var.f34342b);
                    boolean zM6894i2 = ir1Var8.m6894i(es0Var2);
                    Object objM6869O23 = ir1Var8.m6869O();
                    if (zM6894i2 || objM6869O23 == obj9) {
                        objM6869O23 = new C0982og((Object) es0Var2, wm0Var, (byte) 25);
                        ir1Var8.m6905n0(objM6869O23);
                    }
                    lb5.m7927h(c0875lk, ql4VarM9897a, (mq1) objM6869O23, ir1Var8);
                    boolean zM6894i3 = ir1Var8.m6894i(es0Var2) | ir1Var8.m6894i(vi3Var) | ir1Var8.m6890g(xk4Var) | ir1Var8.m6894i(uj2Var) | ir1Var8.m6890g(ga4Var);
                    Object objM6869O24 = ir1Var8.m6869O();
                    Object obj22 = objM6869O24;
                    if (zM6894i3 || objM6869O24 == obj9) {
                        C0869le c0869le2 = new C0869le((byte) 7);
                        c0869le2.f23969c = es0Var2;
                        c0869le2.f23970d = vi3Var;
                        c0869le2.f23968b = xk4Var;
                        c0869le2.f23971e = uj2Var;
                        c0869le2.f23972f = ga4Var;
                        VarHandle.storeStoreFence();
                        ir1Var8.m6905n0(c0869le2);
                        obj22 = c0869le2;
                    }
                    nt2VarM5544o = C0638f5.m5544o(nt2Var4, (yp1) obj22);
                    z3 = false;
                    ir1Var8.m6912r(false);
                } else {
                    z3 = false;
                    ir1Var8.m6885d0(-705473241);
                    ir1Var8.m6912r(false);
                }
                ir1Var8.m6912r(z3);
                return nt2VarM5544o;
        }
    }
}
