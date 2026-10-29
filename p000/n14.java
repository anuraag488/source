package p000;

import ads_mobile_sdk.my3;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.WindowManager;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n14 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25388a;

    public /* synthetic */ n14(byte b) {
        this.f25388a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws PackageManager.NameNotFoundException {
        Object obj3;
        Context context;
        Object obj4;
        dp4 dp4VarM13663O;
        byte b;
        Object obj5;
        Object obj6;
        b91 b91Var;
        Object obj7;
        xn2 xn2Var;
        Object obj8;
        Object obj9;
        Object obj10;
        byte b2 = this.f25388a;
        byte b3 = 12;
        int i = 2;
        ju4 ju4Var = ju4.f22634a;
        Object obj11 = ki0.f23136a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (obj != null || obj2 != null) {
                    xy4.m12778e();
                }
                return null;
            case 1:
                return obj == null ? obj2 : obj;
            case 2:
                i14 i14Var = (i14) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                e14 e14Var = ((i14) obj).f21012d;
                p14 p14Var = m14.f24572u;
                Object objM8132g = e14Var.f17631a.m8132g(p14Var);
                if (objM8132g == null) {
                    objM8132g = objValueOf;
                }
                float fFloatValue = ((Number) objM8132g).floatValue();
                Object objM8132g2 = i14Var.f21012d.f17631a.m8132g(p14Var);
                if (objM8132g2 != null) {
                    objValueOf = objM8132g2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 3:
                ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) ((mi0) obj);
                ir1Var.m6885d0(1158795399);
                oh1 oh1Var = ev0.f18505m;
                ir1Var.m6912r(false);
                return oh1Var;
            case 4:
                ((Integer) obj2).getClass();
                ir1 ir1Var2 = (ir1) ((mi0) obj);
                ir1Var2.m6885d0(478861147);
                WeakHashMap weakHashMap = y05.f34773x;
                gu4 gu4Var = k43.m7390o(ir1Var2).f34785l;
                int i2 = sj3.f30342l;
                wk2 wk2VarM5364n0 = ev0.m5364n0(gu4Var, 48);
                ir1Var2.m6912r(false);
                return wk2VarM5364n0;
            case 5:
                return ((d64) obj2).m4386c();
            case 6:
                ((Integer) obj2).getClass();
                ir1 ir1Var3 = (ir1) ((mi0) obj);
                ir1Var3.m6885d0(293461902);
                Object objM6869O = ir1Var3.m6869O();
                Object obj12 = objM6869O;
                if (objM6869O == obj11) {
                    Object objM7942w = lb5.m7942w(r71.f29063a, ir1Var3);
                    ir1Var3.m6905n0(objM7942w);
                    obj12 = objM7942w;
                }
                zo0 zo0Var = (zo0) obj12;
                Object objM6869O2 = ir1Var3.m6869O();
                Object obj13 = objM6869O2;
                if (objM6869O2 == obj11) {
                    vg4 vg4Var = new vg4();
                    vg4Var.f32601b = zo0Var;
                    v91 v91Var = hh4.f20586d;
                    int iM5779K = fq2.m5779K(ib0.m6717y0(v91Var, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K >= 16 ? iM5779K : 16);
                    for (Object obj14 : v91Var) {
                        linkedHashMap.put(obj14, new ArrayList());
                    }
                    vg4Var.f32600a = linkedHashMap;
                    VarHandle.storeStoreFence();
                    ir1Var3.m6905n0(vg4Var);
                    obj13 = vg4Var;
                }
                vg4 vg4Var2 = (vg4) obj13;
                ir1Var3.m6912r(false);
                return vg4Var2;
            case 7:
                ((Integer) obj2).getClass();
                ir1 ir1Var4 = (ir1) ((mi0) obj);
                ir1Var4.m6885d0(35148793);
                Object objM6869O3 = ir1Var4.m6869O();
                Object obj15 = objM6869O3;
                if (objM6869O3 == obj11) {
                    Object ba4Var = new ba4();
                    ir1Var4.m6905n0(ba4Var);
                    obj15 = ba4Var;
                }
                ba4 ba4Var2 = (ba4) obj15;
                List listM6319e1 = hb0.m6319e1(ba4Var2);
                Object objM6869O4 = ir1Var4.m6869O();
                Object obj16 = objM6869O4;
                if (objM6869O4 == obj11) {
                    Object r54Var = new r54((byte) 11);
                    ir1Var4.m6905n0(r54Var);
                    obj16 = r54Var;
                }
                ListIterator listIterator = y62.m12960b0(listM6319e1, (yp1) obj16, ir1Var4, 432, 0).listIterator();
                while (true) {
                    ow1 ow1Var = (ow1) listIterator;
                    if (!ow1Var.hasNext()) {
                        ir1Var4.m6912r(false);
                        return ba4Var2;
                    }
                    C0800jj c0800jj = (C0800jj) ow1Var.next();
                    ir1Var4.m6879a0(1180162709, c0800jj.f22322a);
                    kx1 kx1Var = (kx1) c0800jj.f22323b.getValue();
                    Object objM6869O5 = ir1Var4.m6869O();
                    if (objM6869O5 == obj11) {
                        obj3 = objM6869O5;
                        Object objM7398w = k43.m7398w(Boolean.FALSE);
                        ir1Var4.m6905n0(objM7398w);
                        obj3 = objM7398w;
                    }
                    obj3 = objM6869O5;
                    sw2 sw2Var = (sw2) obj3;
                    zg4 zg4Var = kx1Var.f23571b;
                    Context context2 = kx1Var.f23570a;
                    if (((Boolean) zg4Var.f36074h.getValue()).booleanValue()) {
                        sw2Var.setValue(Boolean.TRUE);
                    }
                    if (((Boolean) sw2Var.getValue()).booleanValue()) {
                        ir1Var4.m6885d0(-2069410304);
                        Object objM6869O6 = ir1Var4.m6869O();
                        if (objM6869O6 == obj11) {
                            obj6 = objM6869O6;
                            Object objM7398w2 = k43.m7398w(Boolean.FALSE);
                            ir1Var4.m6905n0(objM7398w2);
                            obj6 = objM7398w2;
                        }
                        obj6 = objM6869O6;
                        sw2 sw2Var2 = (sw2) obj6;
                        dp4 dp4VarM13663O2 = zp0.m13663O(c0800jj.f22324c, null, ir1Var4, 0, i);
                        zh0 zh0Var = dp4VarM13663O2.f17258a;
                        if (((Boolean) zh0Var.mo11188l()).booleanValue()) {
                            sw2Var2.setValue(Boolean.TRUE);
                        }
                        boolean zM6890g = ir1Var4.m6890g(dp4VarM13663O2);
                        Object objM6869O7 = ir1Var4.m6869O();
                        if (zM6890g || objM6869O7 == obj11) {
                            objM6869O7 = zh0Var.mo11188l();
                            ir1Var4.m6905n0(objM6869O7);
                        }
                        if (dp4VarM13663O2.m4648j()) {
                            objM6869O7 = zh0Var.mo11188l();
                        }
                        boolean zBooleanValue = ((Boolean) objM6869O7).booleanValue();
                        ir1Var4.m6885d0(396121900);
                        b91 b91Var2 = zBooleanValue ? b91.f15169b : ((Boolean) sw2Var2.getValue()).booleanValue() ? b91.f15170c : b91.f15168a;
                        ir1Var4.m6912r(false);
                        boolean zBooleanValue2 = ((Boolean) dp4VarM13663O2.f17261d.getValue()).booleanValue();
                        ir1Var4.m6885d0(396121900);
                        b91 b91Var3 = zBooleanValue2 ? b91.f15169b : ((Boolean) sw2Var2.getValue()).booleanValue() ? b91.f15170c : b91.f15168a;
                        ir1Var4.m6912r(false);
                        context = context2;
                        dp4VarM13663O = zp0.m13686r(dp4VarM13663O2, b91Var2, b91Var3, "ChildTransition", ir1Var4, 0);
                        if (dp4VarM13663O2.m4648j()) {
                            ir1Var4.m6885d0(782538635);
                            ir1Var4.m6912r(false);
                        } else {
                            ir1Var4.m6885d0(782386797);
                            Object value = dp4VarM13663O2.f17262e.getValue();
                            if (value == null) {
                                ir1Var4.m6885d0(782437481);
                                ir1Var4.m6912r(false);
                                b91Var = null;
                            } else {
                                ir1Var4.m6885d0(782437482);
                                boolean zBooleanValue3 = ((Boolean) value).booleanValue();
                                ir1Var4.m6885d0(396121900);
                                b91Var = zBooleanValue3 ? b91.f15169b : ((Boolean) sw2Var2.getValue()).booleanValue() ? b91.f15170c : b91.f15168a;
                                ir1Var4.m6912r(false);
                                ir1Var4.m6912r(false);
                            }
                            dp4VarM13663O.m4658t(b91Var);
                            ir1Var4.m6912r(false);
                        }
                        ir1Var4.m6912r(false);
                    } else {
                        context = context2;
                        ir1Var4.m6885d0(-2068918768);
                        Object objM6869O8 = ir1Var4.m6869O();
                        if (objM6869O8 == obj11) {
                            obj4 = objM6869O8;
                            Object tw2Var = new tw2(b91.f15168a);
                            ir1Var4.m6905n0(tw2Var);
                            obj4 = tw2Var;
                        }
                        obj4 = objM6869O8;
                        dp4VarM13663O = zp0.m13663O((tw2) obj4, null, ir1Var4, 0, i);
                        ir1Var4.m6912r(false);
                    }
                    Object objM6869O9 = ir1Var4.m6869O();
                    Object obj17 = objM6869O9;
                    if (objM6869O9 == obj11) {
                        yg4 yg4Var = new yg4();
                        yg4Var.f35217a = k43.m7398w(dp4VarM13663O);
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(yg4Var);
                        obj17 = yg4Var;
                    }
                    yg4 yg4Var2 = (yg4) obj17;
                    yg4Var2.f35217a.setValue(dp4VarM13663O);
                    gr1 gr1VarM4685N = dt0.m4685N(ir1Var4);
                    boolean zM6890g2 = ir1Var4.m6890g(gr1VarM4685N);
                    Object objM6869O10 = ir1Var4.m6869O();
                    if (zM6890g2 || objM6869O10 == obj11) {
                        C0928n c0928n = new C0928n((byte) 24);
                        c0928n.f25353b = kx1Var;
                        VarHandle.storeStoreFence();
                        pg0 pg0Var = new pg0(-1106873988, true, c0928n);
                        nh4 nh4Var = new nh4(context);
                        nh4Var.f25812a = zg4Var;
                        nh4Var.f25813b = yg4Var2;
                        nh4Var.f25814c = pg0Var;
                        nh4Var.f25815d = new ok2(nh4Var, true);
                        g32 g32Var = new g32((byte) 20);
                        g32Var.f19558b = nh4Var;
                        VarHandle.storeStoreFence();
                        zu3 zu3Var = new zu3();
                        zu3Var.f36384a = nh4Var;
                        zu3Var.f36385b = g32Var;
                        zu3Var.f36386c = new r50((byte) 19);
                        zu3Var.f36387d = new LinkedHashMap();
                        b = 1;
                        zu3Var.f36391h = true;
                        VarHandle.storeStoreFence();
                        pq3 pq3Var = new pq3(b);
                        pq3Var.f27896b = zu3Var;
                        yu3 yu3Var = new yu3();
                        yu3Var.f35540a = zu3Var;
                        VarHandle.storeStoreFence();
                        pq3Var.f27897c = yu3Var;
                        VarHandle.storeStoreFence();
                        nh4Var.f25816e = pq3Var;
                        nh4Var.f25817f = new t33(null);
                        nh4Var.f25819h = new mw3();
                        nh4Var.f25820i = (WindowManager) context.getSystemService(WindowManager.class);
                        nh4Var.f25821j = k43.m7397v();
                        nh4Var.f25822k = new LinkedHashMap();
                        nh4Var.f25823l = new LinkedHashMap();
                        nh4Var.f25826o = new a83(0);
                        mh4 mh4Var = new mh4(nh4Var, context);
                        nh4Var.f25828q = mh4Var;
                        nh4Var.setTag(C0995R.id.view_tree_lifecycle_owner, nh4Var);
                        nh4Var.setTag(C0995R.id.view_tree_saved_state_registry_owner, nh4Var);
                        nh4Var.setTag(C0995R.id.view_tree_on_back_pressed_dispatcher_owner, nh4Var);
                        pq3Var.m9608f(null);
                        ((ok2) nh4Var.getLifecycle()).m9156h(fk2.f19056c);
                        nh4Var.addView(mh4Var);
                        mh4Var.setParentCompositionContext(gr1VarM4685N);
                        mh4Var.setViewCompositionStrategy(ig1.f21366E);
                        mh4Var.m10170d();
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(nh4Var);
                        obj5 = nh4Var;
                    } else {
                        b = 1;
                        obj5 = objM6869O10;
                    }
                    nh4 nh4Var2 = (nh4) obj5;
                    boolean zM6890g3 = ir1Var4.m6890g(nh4Var2);
                    Object objM6869O11 = ir1Var4.m6869O();
                    Object obj18 = objM6869O11;
                    if (zM6890g3 || objM6869O11 == obj11) {
                        o04 o04Var = new o04((byte) 9);
                        o04Var.f26271b = nh4Var2;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(o04Var);
                        obj18 = o04Var;
                    }
                    lb5.m7923d(nh4Var2, (yp1) obj18, ir1Var4);
                    boolean zM6890g4 = ir1Var4.m6890g(context);
                    Object objM6869O12 = ir1Var4.m6869O();
                    if (zM6890g4 || objM6869O12 == obj11) {
                        objM6869O12 = context.getSystemService((Class<Object>) WindowManager.class);
                        ir1Var4.m6905n0(objM6869O12);
                    }
                    c20.m3812g(nh4Var2, zg4Var, (WindowManager) objM6869O12, ir1Var4, 0);
                    ir1Var4.m6912r(false);
                    i = 2;
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ir1 ir1Var5 = (ir1) ((mi0) obj);
                ir1Var5.m6885d0(957379113);
                C0950nl c0950nl = (C0950nl) ir1Var5.m6898k(AbstractC0987ol.m9168a());
                boolean zM6894i = ir1Var5.m6894i(c0950nl);
                Object objM6869O13 = ir1Var5.m6869O();
                Object obj19 = objM6869O13;
                if (zM6894i || objM6869O13 == obj11) {
                    C0854l c0854l = new C0854l((byte) 4);
                    c0854l.f23655b = c0950nl;
                    VarHandle.storeStoreFence();
                    ir1Var5.m6905n0(c0854l);
                    obj19 = c0854l;
                }
                mq1 mq1VarM7368B = k43.m7368B(true, (wp1) obj19, ir1Var5);
                ir1Var5.m6912r(false);
                return mq1VarM7368B;
            case 9:
                ((Integer) obj2).getClass();
                ir1 ir1Var6 = (ir1) ((mi0) obj);
                ir1Var6.m6885d0(719381529);
                Object objM6869O14 = ir1Var6.m6869O();
                Object obj20 = objM6869O14;
                if (objM6869O14 == obj11) {
                    Object da2Var = new da2(b3);
                    ir1Var6.m6905n0(da2Var);
                    obj20 = da2Var;
                }
                wp1 wp1Var = (wp1) obj20;
                a44 a44Var = (a44) ir1Var6.m6898k(h44.m6217a());
                Object objM6869O15 = ir1Var6.m6869O();
                Object obj21 = objM6869O15;
                if (objM6869O15 == obj11) {
                    Object obj22 = C0971o5.f26349l;
                    ir1Var6.m6905n0(obj22);
                    obj21 = obj22;
                }
                g44 g44VarM6218b = h44.m6218b("show_bounds", (wp1) obj21, a44Var, wp1Var, ir1Var6);
                boolean zM6890g5 = ir1Var6.m6890g(g44VarM6218b);
                Object objM6869O16 = ir1Var6.m6869O();
                Object obj23 = objM6869O16;
                if (zM6890g5 || objM6869O16 == obj11) {
                    se3 se3Var = new se3(z ? 1 : 0);
                    se3Var.f30215b = g44VarM6218b;
                    VarHandle.storeStoreFence();
                    ir1Var6.m6905n0(se3Var);
                    obj23 = se3Var;
                }
                cv0.m4169a((yp1) obj23, ir1Var6, 0);
                Boolean bool = (Boolean) g44VarM6218b.getValue();
                bool.booleanValue();
                ir1Var6.m6912r(false);
                return bool;
            case 10:
                hk4 hk4Var = (hk4) obj2;
                return kx5.m7694Y(Float.valueOf(hk4Var.f20659a.m13399h()), Boolean.valueOf(((d63) hk4Var.f20664f.getValue()) == d63.f16814a));
            case 11:
                fu3 fu3Var = (fu3) obj;
                xk4 xk4Var = (xk4) obj2;
                return kx5.m7730r(jv3.m7297b(xk4Var.f34341a, jv3.f22668a, fu3Var), jv3.m7297b(ql4.m9897a(xk4Var.f34342b), jv3.f22683p, fu3Var));
            case 12:
                po0 po0Var = (po0) obj2;
                if (!(po0Var instanceof my3)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? po0Var : Integer.valueOf(iIntValue + 1);
            case 13:
                my3 my3Var = (my3) obj;
                po0 po0Var2 = (po0) obj2;
                if (my3Var != null) {
                    return my3Var;
                }
                if (po0Var2 instanceof my3) {
                    return (my3) po0Var2;
                }
                return null;
            case 14:
                hm4 hm4Var = (hm4) obj;
                po0 po0Var3 = (po0) obj2;
                if (po0Var3 instanceof my3) {
                    my3 my3Var2 = (my3) po0Var3;
                    Object objUpdateThreadContext = my3Var2.updateThreadContext(hm4Var.f20701a);
                    Object[] objArr = hm4Var.f20702b;
                    int i3 = hm4Var.f20704d;
                    objArr[i3] = objUpdateThreadContext;
                    my3[] my3VarArr = hm4Var.f20703c;
                    hm4Var.f20704d = i3 + 1;
                    my3VarArr[i3] = my3Var2;
                }
                return hm4Var;
            case 15:
                ((Integer) obj2).getClass();
                ir1 ir1Var7 = (ir1) ((mi0) obj);
                ir1Var7.m6885d0(352551448);
                z93 z93VarM10793B = sj3.m10793B(ir1Var7, 0, 1);
                dz0 dz0VarM10705T = se0.m10705T(ir1Var7);
                xn2 xn2Var2 = (xn2) ir1Var7.m6898k(yn2.f35357b);
                if (xn2Var2 == null) {
                    ir1Var7.m6885d0(-1476823888);
                    ir1Var7.m6912r(false);
                    xn2Var = null;
                } else {
                    ir1Var7.m6885d0(-1476823887);
                    boolean zM6890g6 = ir1Var7.m6890g("SystemPanelState") | ir1Var7.m6890g(xn2Var2);
                    Object objM6869O17 = ir1Var7.m6869O();
                    if (zM6890g6 || objM6869O17 == obj11) {
                        obj7 = objM6869O17;
                        Object objM12723c = xn2Var2.m12723c("SystemPanelState");
                        ir1Var7.m6905n0(objM12723c);
                        obj7 = objM12723c;
                    }
                    xn2Var = (xn2) obj7;
                    ir1Var7.m6912r(false);
                }
                C1354y3 c1354y3 = (C1354y3) ir1Var7.m6898k(AbstractC0637f4.f18723a);
                yp1 yp1VarM7086b = je0.m7086b(ir1Var7);
                Object objM6869O18 = ir1Var7.m6869O();
                Object obj24 = objM6869O18;
                if (objM6869O18 == obj11) {
                    hn4 hn4Var = new hn4();
                    hn4Var.f20726b = xn2Var;
                    hn4Var.f20727c = z93VarM10793B;
                    hn4Var.f20728d = dz0VarM10705T;
                    hn4Var.f20729e = c1354y3;
                    hn4Var.f20730f = yp1VarM7086b;
                    hn4Var.f20725a = k43.m7398w(null);
                    VarHandle.storeStoreFence();
                    ir1Var7.m6905n0(hn4Var);
                    obj24 = hn4Var;
                }
                hn4 hn4Var2 = (hn4) obj24;
                Context applicationContext = ((Context) ir1Var7.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                boolean zM6890g7 = ir1Var7.m6890g((Configuration) ir1Var7.m6898k(AndroidCompositionLocals_androidKt.f14650a));
                Object objM6869O19 = ir1Var7.m6869O();
                if (zM6890g7 || objM6869O19 == obj11) {
                    Resources resourcesForApplication = applicationContext.getPackageManager().getResourcesForApplication("com.android.systemui");
                    v91 v91Var2 = oh4.f26704f;
                    int iM5779K2 = fq2.m5779K(ib0.m6717y0(v91Var2, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM5779K2 >= 16 ? iM5779K2 : 16);
                    for (Object obj25 : v91Var2) {
                        linkedHashMap2.put(resourcesForApplication.getString(resourcesForApplication.getIdentifier(((oh4) obj25).f26705a, "string", "com.android.systemui")), obj25);
                    }
                    ir1Var7.m6905n0(linkedHashMap2);
                    objM6869O19 = linkedHashMap2;
                }
                sw2 sw2VarM7369C = k43.m7369C((Map) objM6869O19, ir1Var7);
                if (xn2Var != null) {
                    ir1Var7.m6885d0(1667027591);
                    oh4 oh4Var = (oh4) hn4Var2.f20725a.getValue();
                    boolean zM6894i2 = ir1Var7.m6894i(xn2Var);
                    Object objM6869O20 = ir1Var7.m6869O();
                    if (zM6894i2 || objM6869O20 == obj11) {
                        obj10 = objM6869O20;
                        jp1 jp1Var = new jp1((byte) 27);
                        jp1Var.f22485b = xn2Var;
                        jp1Var.f22486c = hn4Var2;
                        VarHandle.storeStoreFence();
                        ir1Var7.m6905n0(jp1Var);
                        obj10 = jp1Var;
                    }
                    lb5.m7932m(oh4Var, (wp1) obj10, ir1Var7);
                    ir1Var7.m6912r(false);
                } else {
                    ir1Var7.m6885d0(1667122730);
                    ir1Var7.m6912r(false);
                }
                if (((Boolean) dz0VarM10705T.f17512c.getValue()).booleanValue()) {
                    ir1Var7.m6885d0(1667177538);
                    boolean zM6890g8 = ir1Var7.m6890g(sw2VarM7369C);
                    Object objM6869O21 = ir1Var7.m6869O();
                    if (zM6890g8 || objM6869O21 == obj11) {
                        obj9 = objM6869O21;
                        cz3 cz3Var = new cz3(b3);
                        cz3Var.f16638b = hn4Var2;
                        cz3Var.f16639c = sw2VarM7369C;
                        VarHandle.storeStoreFence();
                        ir1Var7.m6905n0(cz3Var);
                        obj9 = cz3Var;
                    }
                    AbstractC0637f4.m5467b(32, true, null, (yp1) obj9, ir1Var7, 54, 4);
                    ir1Var7.m6912r(false);
                } else {
                    ir1Var7.m6885d0(1667900210);
                    Object objM6869O22 = ir1Var7.m6869O();
                    if (objM6869O22 == obj11) {
                        obj8 = objM6869O22;
                        sj4 sj4Var = new sj4((byte) 3);
                        sj4Var.f30344b = hn4Var2;
                        VarHandle.storeStoreFence();
                        ir1Var7.m6905n0(sj4Var);
                        obj8 = sj4Var;
                    }
                    obj8 = objM6869O22;
                    lb5.m7932m(ju4Var, (wp1) obj8, ir1Var7);
                    ir1Var7.m6912r(false);
                }
                ir1Var7.m6912r(false);
                return hn4Var2;
            case 16:
                ho4 ho4Var = (ho4) obj2;
                return kx5.m7694Y(Float.valueOf(ho4Var.f20756a), Float.valueOf(ho4Var.f20759d.m13399h()), Float.valueOf(ho4Var.f20757b.m13399h()));
            case 17:
                mi0 mi0Var = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var8 = (ir1) mi0Var;
                if (ir1Var8.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gl4.m6037b("Add button", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var8, 0, 0, 262142);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            case 18:
                ia5.f21218i.invoke(obj);
                return ju4Var;
            default:
                ((Integer) obj2).getClass();
                ir1 ir1Var9 = (ir1) ((mi0) obj);
                ir1Var9.m6885d0(21870729);
                C0950nl c0950nl2 = (C0950nl) ir1Var9.m6898k(AbstractC0987ol.m9168a());
                boolean zM6894i3 = ir1Var9.m6894i(c0950nl2);
                Object objM6869O23 = ir1Var9.m6869O();
                Object obj26 = objM6869O23;
                if (zM6894i3 || objM6869O23 == obj11) {
                    C0854l c0854l2 = new C0854l((byte) 5);
                    c0854l2.f23655b = c0950nl2;
                    VarHandle.storeStoreFence();
                    ir1Var9.m6905n0(c0854l2);
                    obj26 = c0854l2;
                }
                mq1 mq1VarM7368B2 = k43.m7368B(false, (wp1) obj26, ir1Var9);
                ir1Var9.m6912r(false);
                return mq1VarM7368B2;
        }
    }
}
