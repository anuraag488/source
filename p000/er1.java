package p000;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.session.PlaybackState;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.p001ui.tooling.PreviewActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18411a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18412b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18413c;

    public /* synthetic */ er1(byte b) {
        this.f18411a = b;
    }

    /* JADX INFO: renamed from: b */
    private final Object m5292b(Object obj, Object obj2) {
        lr2 lr2Var = (lr2) this.f18412b;
        sw2 sw2Var = (sw2) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            je0.m7085a((g12) lr2Var.f24315b.invoke((PlaybackState) sw2Var.getValue()), null, null, ir1Var, 0, 6);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m5293e(Object obj, Object obj2) {
        e13 e13Var = (e13) this.f18412b;
        b13 b13Var = (b13) this.f18413c;
        h70 h70Var = (h70) obj;
        bu1 bu1Var = (bu1) obj2;
        wf2 wf2Var = e13Var.f17625u;
        if (wf2Var.m12257K()) {
            e13Var.f17619R = h70Var;
            e13Var.f17618Q = bu1Var;
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getSnapshotObserver();
            snapshotObserver.f31675a.m159e(e13Var, e13.f17596Y, b13Var);
            e13Var.f17622U = false;
        } else {
            e13Var.f17622U = true;
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m5294f(Object obj, Object obj2) throws Exception {
        String str = (String) this.f18412b;
        String str2 = (String) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = PreviewActivity.f14656w;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            zp0.m13651B(str, str2, ir1Var, new Object[0]);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m5295h(Object obj, Object obj2) {
        pg0 pg0Var = (pg0) this.f18412b;
        ov3 ov3Var = (ov3) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            pg0Var.invoke(ov3Var, ir1Var, 6);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m5296i(Object obj, Object obj2) {
        nq1 nq1Var = (nq1) this.f18412b;
        z73 z73Var = (z73) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            nq1Var.invoke(Float.valueOf(z73Var.m13399h()), ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m5297j(Object obj, Object obj2) {
        lz3 lz3Var = (lz3) this.f18412b;
        sg2 sg2Var = (sg2) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            lz3Var.f24485b.invoke(sg2Var, ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m5298k(Object obj, Object obj2) {
        nq1 nq1Var = (nq1) this.f18412b;
        sg2 sg2Var = (sg2) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            nq1Var.invoke(sg2Var, ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m5299l(Object obj, Object obj2) {
        o54 o54Var = (o54) this.f18412b;
        mq1 mq1Var = (mq1) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            o54Var.f26357d.setValue(mq1Var.invoke(ir1Var, 0));
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m5300m(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        v54.m11750a((nt2) this.f18412b, (mq1) this.f18413c, (mi0) obj, vd6.m11838V(1));
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m5301n(Object obj, Object obj2) {
        kx1 kx1Var = (kx1) this.f18412b;
        yg4 yg4Var = (yg4) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            ((nq1) kx1Var.f23573d.getValue()).invoke(yg4Var, ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

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
    /* JADX INFO: renamed from: o */
    private final Object m5302o(Object obj, Object obj2) {
        Object obj3;
        mh4 mh4Var = (mh4) this.f18412b;
        nh4 nh4Var = (nh4) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        byte b = 2;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zM6894i = ir1Var.m6894i(mh4Var) | ir1Var.m6890g(nh4Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj3 = objM6869O;
                C0981of c0981of = new C0981of(b);
                c0981of.f26662b = mh4Var;
                c0981of.f26663c = nh4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0981of);
                obj3 = c0981of;
            }
            obj3 = objM6869O;
            xq2 xq2Var = (xq2) obj3;
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, kt2.f23428a);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2Var);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            nh4Var.f25814c.invoke(nh4Var.f25813b, ir1Var, 0);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m5303p(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((gb5) this.f18412b).m5962g((Drawable) this.f18413c, (mi0) obj, vd6.m11838V(49));
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m5304q(Object obj, Object obj2) {
        ql4 ql4VarM9897a;
        pk4 pk4Var = (pk4) this.f18412b;
        zo0 zo0Var = (zo0) this.f18413c;
        bj4 bj4Var = (bj4) obj;
        Context context = (Context) obj2;
        boolean zM9546h = pk4Var.m9546h();
        C0875lk c0875lkM9549k = pk4Var.m9549k();
        aj4 aj4Var = null;
        String str = c0875lkM9549k != null ? c0875lkM9549k.f24092b : null;
        ql4 ql4Var = pk4Var.f27714v;
        if (ql4Var != null) {
            long j = ql4Var.f28558a;
            vi3 vi3Var = pk4Var.f27694b;
            int i = (int) (j >> 32);
            vi3Var.m11898a(i);
            int i2 = (int) (j & 4294967295L);
            vi3Var.m11898a(i2);
            ql4VarM9897a = ql4.m9897a(sc6.m10657b(i, i2));
        } else {
            ql4VarM9897a = null;
        }
        tb3 tb3Var = pk4Var.f27701i;
        bh4 bh4Var = new bh4((byte) 4);
        bh4Var.f15274b = pk4Var;
        bh4Var.f15275c = zo0Var;
        bh4Var.f15276d = context;
        VarHandle.storeStoreFence();
        nc4 nc4Var = ub3.f31776a;
        if (str == null || ql4VarM9897a == null || tb3Var == null) {
            bh4Var.invoke(bj4Var);
            if (str != null && ql4VarM9897a != null) {
                C0006a5.m67e(bj4Var, context, zM9546h, str, ql4VarM9897a.f28558a);
            }
        } else {
            long j2 = ql4VarM9897a.f28558a;
            Object obj3 = tb3Var.f31060h;
            gx2 gx2Var = tb3Var.f31057e;
            if (gx2Var.m6192f()) {
                aj4 aj4Var2 = (aj4) tb3Var.f31059g.getValue();
                if (aj4Var2 == null || !ql4.m9899c(j2, aj4Var2.f14543b) || !z62.m13387o(str, aj4Var2.f14542a)) {
                    aj4Var2 = null;
                }
                gx2Var.m6193g(null);
                aj4Var = aj4Var2;
            }
            if (aj4Var == null) {
                bh4Var.invoke(bj4Var);
            } else {
                ArrayList arrayList = aj4Var.f14545d;
                TextClassification textClassification = aj4Var.f14544c;
                if (!textClassification.getActions().isEmpty()) {
                    k43.m7375I(bj4Var, obj3, textClassification, 0, (Drawable) arrayList.get(0));
                } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                    k43.m7375I(bj4Var, obj3, textClassification, -1, textClassification.getIcon());
                }
                bh4Var.invoke(bj4Var);
                List<RemoteAction> actions = textClassification.getActions();
                int size = actions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    actions.get(i3);
                    if (i3 > 0) {
                        k43.m7375I(bj4Var, obj3, textClassification, i3, (Drawable) arrayList.get(i3));
                    }
                }
            }
            C0006a5.m67e(bj4Var, context, zM9546h, str, ql4VarM9897a.f28558a);
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m5305r(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        gl4.m6036a((xl4) this.f18412b, (mq1) this.f18413c, (mi0) obj, vd6.m11838V(1));
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m5306s(Object obj, Object obj2) {
        Object obj3;
        sw2 sw2Var = (sw2) this.f18412b;
        mq1 mq1Var = (mq1) this.f18413c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                obj3 = objM6869O;
                C0761ih c0761ih = new C0761ih((byte) 14);
                c0761ih.f21416b = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0761ih);
                obj3 = c0761ih;
            }
            obj3 = objM6869O;
            nt2 nt2VarM9120z = oh6.m9120z(kt2.f23428a, (yp1) obj3);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            mq1Var.invoke(ir1Var, 0);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0317  */
    /* JADX WARN: Code duplicated, block: B:133:0x031d  */
    /* JADX WARN: Code duplicated, block: B:135:0x032c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0338  */
    /* JADX WARN: Code duplicated, block: B:141:0x033f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0348  */
    /* JADX WARN: Code duplicated, block: B:146:0x0355  */
    /* JADX WARN: Code duplicated, block: B:148:0x035d  */
    /* JADX WARN: Code duplicated, block: B:151:0x036c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0372  */
    /* JADX WARN: Code duplicated, block: B:154:0x0376  */
    /* JADX WARN: Code duplicated, block: B:157:0x0382  */
    /* JADX WARN: Code duplicated, block: B:159:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x03a5 A[LOOP:28: B:167:0x03a5->B:169:0x03aa, LOOP_START, PHI: r13
  0x03a5: PHI (r13v15 int) = (r13v13 int), (r13v16 int) binds: [B:166:0x03a3, B:169:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x03aa A[LOOP:28: B:167:0x03a5->B:169:0x03aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:190:0x0403  */
    /* JADX WARN: Code duplicated, block: B:192:0x0425  */
    /* JADX WARN: Code duplicated, block: B:194:0x042f  */
    /* JADX WARN: Code duplicated, block: B:197:0x045f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0464  */
    /* JADX WARN: Code duplicated, block: B:202:0x0492  */
    /* JADX WARN: Code duplicated, block: B:204:0x049f  */
    /* JADX WARN: Code duplicated, block: B:211:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:220:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:223:0x0505  */
    /* JADX WARN: Code duplicated, block: B:224:0x0509  */
    /* JADX WARN: Code duplicated, block: B:228:0x051a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x056c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0585  */
    /* JADX WARN: Code duplicated, block: B:254:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:255:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:256:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:262:0x05df  */
    /* JADX WARN: Code duplicated, block: B:272:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:276:0x0606  */
    /* JADX WARN: Code duplicated, block: B:281:0x0619  */
    /* JADX WARN: Code duplicated, block: B:283:0x0627 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x0647  */
    /* JADX WARN: Code duplicated, block: B:291:0x064a  */
    /* JADX WARN: Code duplicated, block: B:294:0x065e A[LOOP:4: B:290:0x0648->B:294:0x065e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x0665  */
    /* JADX WARN: Code duplicated, block: B:299:0x0673  */
    /* JADX WARN: Code duplicated, block: B:301:0x0677 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x0679  */
    /* JADX WARN: Code duplicated, block: B:304:0x068c  */
    /* JADX WARN: Code duplicated, block: B:307:0x0697  */
    /* JADX WARN: Code duplicated, block: B:310:0x06a5 A[LOOP:6: B:309:0x06a3->B:310:0x06a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:315:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:318:0x06ed A[LOOP:7: B:314:0x06d7->B:318:0x06ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:319:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:326:0x0714  */
    /* JADX WARN: Code duplicated, block: B:328:0x0718 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:329:0x071a  */
    /* JADX WARN: Code duplicated, block: B:331:0x072d  */
    /* JADX WARN: Code duplicated, block: B:334:0x073a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0746 A[LOOP:9: B:336:0x0744->B:337:0x0746, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:345:0x076e  */
    /* JADX WARN: Code duplicated, block: B:347:0x0771  */
    /* JADX WARN: Code duplicated, block: B:348:0x0773  */
    /* JADX WARN: Code duplicated, block: B:351:0x077a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0781  */
    /* JADX WARN: Code duplicated, block: B:355:0x0783  */
    /* JADX WARN: Code duplicated, block: B:358:0x078a  */
    /* JADX WARN: Code duplicated, block: B:359:0x078d  */
    /* JADX WARN: Code duplicated, block: B:366:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:371:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:374:0x07ce A[LOOP:10: B:373:0x07cc->B:374:0x07ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x07df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:379:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:381:0x0804  */
    /* JADX WARN: Code duplicated, block: B:383:0x080a  */
    /* JADX WARN: Code duplicated, block: B:392:0x0854 A[LOOP:11: B:390:0x0840->B:392:0x0854, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:394:0x0860  */
    /* JADX WARN: Code duplicated, block: B:396:0x0867  */
    /* JADX WARN: Code duplicated, block: B:398:0x0885 A[LOOP:21: B:397:0x0883->B:398:0x0885, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:401:0x08ad A[LOOP:22: B:400:0x08ab->B:401:0x08ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:404:0x08c8 A[LOOP:23: B:403:0x08c6->B:404:0x08c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:407:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:409:0x090f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:410:0x0911  */
    /* JADX WARN: Code duplicated, block: B:412:0x0915  */
    /* JADX WARN: Code duplicated, block: B:415:0x0930  */
    /* JADX WARN: Code duplicated, block: B:416:0x0932  */
    /* JADX WARN: Code duplicated, block: B:418:0x0935  */
    /* JADX WARN: Code duplicated, block: B:420:0x093c A[LOOP:12: B:419:0x093a->B:420:0x093c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:421:0x094c  */
    /* JADX WARN: Code duplicated, block: B:424:0x0956  */
    /* JADX WARN: Code duplicated, block: B:425:0x0958  */
    /* JADX WARN: Code duplicated, block: B:428:0x0962  */
    /* JADX WARN: Code duplicated, block: B:429:0x0965  */
    /* JADX WARN: Code duplicated, block: B:432:0x096e  */
    /* JADX WARN: Code duplicated, block: B:434:0x0973  */
    /* JADX WARN: Code duplicated, block: B:512:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:514:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:516:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:517:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:518:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:520:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:521:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:524:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:526:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:528:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:529:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:530:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:538:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:541:0x0b67  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:544:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:545:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:551:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:558:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:560:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:563:0x0bbe A[LOOP:19: B:562:0x0bbc->B:563:0x0bbe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:655:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0859 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x060d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x03ad A[SYNTHETIC] */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        Object obj3;
        float fMo11068a;
        int i2;
        int i3;
        int iM132h;
        b30 b30Var;
        AbstractC0003a2 abstractC0003a2M12171e;
        uw2 uw2Var;
        boolean z2;
        kv2 kv2Var;
        int i4;
        int iMin;
        int iMo103a;
        int i5;
        int i6;
        kv2 kv2Var2;
        int iM5546q;
        int i7;
        Object[] objArr;
        int i8;
        int i9;
        Object[] objArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        float fFloatValue;
        boolean z3;
        jh2 jh2Var;
        boolean zMo3587z;
        zo0 zo0Var;
        sw2 sw2Var;
        au1 au1Var;
        h50 h50Var;
        w71 w71Var;
        v71 v71Var;
        ki2 ki2Var;
        long j;
        int iRound;
        int i14;
        C0461ao c0461ao;
        float f;
        int i15;
        int i16;
        sw2 sw2Var2;
        int i17;
        si2 si2Var;
        int iM8775b;
        w71 w71Var2;
        int iMax;
        int i18;
        int i19;
        int i20;
        int i21;
        int iM8775b2;
        int iM8775b3;
        int i22;
        int i23;
        boolean z4;
        int i24;
        int iMax2;
        int i25;
        int iM8775b4;
        int i26;
        float f2;
        float f3;
        float f4;
        float f5;
        int i27;
        float f6;
        int iMo3088a;
        int i28;
        int i29;
        ni2 ni2Var;
        int iMax3;
        int i30;
        int i31;
        int i32;
        List arrayList;
        int[] iArr;
        int i33;
        List list;
        int size;
        int iMax4;
        int i34;
        int iMin2;
        int i35;
        List list2;
        oh2 oh2Var;
        List arrayList2;
        int[] iArr2;
        int i36;
        int i37;
        List list3;
        int size2;
        int i38;
        boolean z5;
        int i39;
        int iM8015g;
        int iM8014f;
        int i40;
        boolean z6;
        ArrayList arrayList3;
        oh2 oh2Var2;
        int size3;
        int iM8775b5;
        int i41;
        oh2 oh2Var3;
        int iMo3088a2;
        int iM8775b6;
        int i42;
        int size4;
        int i43;
        boolean z7;
        float f7;
        int i44;
        boolean z8;
        Object obj4;
        ni2 ni2Var2;
        int i45;
        ni2 ni2Var3;
        int i46;
        boolean z9;
        float f8;
        int i47;
        List list4;
        Object obj5;
        ni2 ni2Var4;
        Integer numValueOf;
        ni2 ni2Var5;
        Integer numValueOf2;
        boolean z10;
        zq2 zq2Var;
        int iIntValue;
        int iIntValue2;
        int size5;
        int i48;
        List list5;
        int i49;
        d63 d63Var;
        int size6;
        int i50;
        int i51;
        mi2 mi2Var;
        ni2 ni2Var6;
        ni2 ni2Var7;
        int i52;
        kv2 kv2Var3;
        int i53;
        int i54;
        ArrayList arrayList4;
        Object obj6;
        int i55;
        int i56;
        int iMax5;
        int i57;
        int iM7635c;
        long jM7124a;
        int i58;
        int i59;
        int size7;
        int i60;
        int iMo3088a3;
        int[] iArr3;
        int i61;
        int[] iArr4;
        oh2 oh2Var4;
        int i62;
        oh2 oh2Var5;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        ni2 ni2VarM7521a;
        int iM7541k;
        int iM7540j;
        d63 d63Var2;
        long jM7124a2;
        String str;
        byte b = this.f18411a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                su2 su2Var = (su2) this.f18412b;
                Object obj7 = this.f18413c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    su2Var.getClass();
                    AbstractC0647fd.f18913c.invoke(obj7, ir1Var, 0);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                om3 om3Var = (om3) this.f18412b;
                p84 p84Var = (p84) this.f18413c;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof ph0) {
                    om3Var.f26885f.m11663b((ph0) obj2);
                } else if (!(obj2 instanceof ip3)) {
                    if (obj2 instanceof mr1) {
                        gq6.m6067E(p84Var, iIntValue4, obj2);
                        om3Var.m9188e((mr1) obj2);
                    } else if (obj2 instanceof yk3) {
                        gq6.m6067E(p84Var, iIntValue4, obj2);
                        ((yk3) obj2).m13154c();
                    }
                }
                return ju4Var;
            case 2:
                cg2 cg2Var = (cg2) this.f18412b;
                mq1 mq1Var = (mq1) this.f18413c;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Boolean bool = (Boolean) cg2Var.f16003g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    ir1Var2.m6891g0(bool);
                    boolean zM6892h = ir1Var2.m6892h(zBooleanValue);
                    if (zBooleanValue) {
                        mq1Var.invoke(ir1Var2, 0);
                    } else {
                        if (ir1Var2.f21696l != 0) {
                            qi0.m9889a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!ir1Var2.f21682S) {
                            if (zM6892h) {
                                l84 l84Var = ir1Var2.f21670G;
                                int i72 = l84Var.f23853g;
                                int i73 = l84Var.f23854h;
                                ni0 ni0Var = ir1Var2.f21676M;
                                ni0Var.getClass();
                                ni0Var.m8771d(false);
                                ni0Var.f25831b.f34991a.m12494X(r43.f28998c);
                                gq6.m6068F(ir1Var2.f21703s, i72, i73);
                                ir1Var2.f21670G.m7864t();
                            } else {
                                ir1Var2.m6873V();
                            }
                        }
                    }
                    if (ir1Var2.f21709y && ir1Var2.f21670G.f23855i == ir1Var2.f21710z) {
                        ir1Var2.f21710z = -1;
                        z = false;
                        ir1Var2.f21709y = false;
                    } else {
                        z = false;
                    }
                    ir1Var2.m6912r(z);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 3:
                lh2 lh2Var = (lh2) this.f18412b;
                kh2 kh2Var = (kh2) this.f18413c;
                Object obj8 = kh2Var.f23124a;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    hi2 hi2Var = (hi2) lh2Var.f24033b.invoke();
                    int iM7080e = kh2Var.f23126c;
                    if (iM7080e >= hi2Var.m6409c() || !hi2Var.m6410d(iM7080e).equals(obj8)) {
                        iM7080e = hi2Var.f20600d.m7080e(obj8);
                        i = -1;
                        if (iM7080e != -1) {
                            kh2Var.f23126c = iM7080e;
                        }
                    } else {
                        i = -1;
                    }
                    int i74 = iM7080e;
                    if (i74 != i) {
                        ir1Var3.m6885d0(-1664741271);
                        C0006a5.m64b(hi2Var, lh2Var.f24032a, i74, obj8, ir1Var3, 0);
                        ir1Var3.m6912r(false);
                    } else {
                        ir1Var3.m6885d0(-1664505826);
                        ir1Var3.m6912r(false);
                    }
                    boolean zM6894i = ir1Var3.m6894i(kh2Var);
                    Object objM6869O = ir1Var3.m6869O();
                    if (zM6894i || objM6869O == ki0.f23136a) {
                        obj3 = objM6869O;
                        b71 b71Var = new b71((byte) 11);
                        b71Var.f15141b = kh2Var;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(b71Var);
                        obj3 = b71Var;
                    }
                    obj3 = objM6869O;
                    lb5.m7923d(obj8, (yp1) obj3, ir1Var3);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 4:
                lh2 lh2Var2 = (lh2) this.f18412b;
                li2 li2Var = (li2) this.f18413c;
                fe4 fe4Var = (fe4) obj;
                oh2 oh2Var6 = new oh2();
                oh2Var6.f26695a = lh2Var2;
                oh2Var6.f26696b = fe4Var;
                oh2Var6.f26697c = (hi2) lh2Var2.f24033b.invoke();
                n52.m8536a();
                oh2Var6.f26698d = new lv2();
                VarHandle.storeStoreFence();
                long j2 = ((kl0) obj2).f23210a;
                InterfaceC1188tn interfaceC1188tn = li2Var.f24051f;
                InterfaceC1299wn interfaceC1299wn = li2Var.f24050e;
                e73 e73Var = li2Var.f24048c;
                boolean z11 = li2Var.f24047b;
                si2 si2Var2 = li2Var.f24046a;
                sw2 sw2Var3 = si2Var2.f30313s;
                g90 g90Var = si2Var2.f30299e;
                sw2Var3.getValue();
                boolean z12 = si2Var2.f30296b || fe4Var.mo3587z();
                qq2.m10027k(j2, z11 ? d63.f16814a : d63.f16815b);
                int iMo3579U = z11 ? fe4Var.mo3579U(e73Var.mo3502a(fe4Var.getLayoutDirection())) : fe4Var.mo3579U(AbstractC0647fd.m5681t(e73Var, fe4Var.getLayoutDirection()));
                int iMo3579U2 = z11 ? fe4Var.mo3579U(e73Var.mo3503b(fe4Var.getLayoutDirection())) : fe4Var.mo3579U(AbstractC0647fd.m5680s(e73Var, fe4Var.getLayoutDirection()));
                int iMo3579U3 = fe4Var.mo3579U(e73Var.mo3505d());
                int iMo3579U4 = fe4Var.mo3579U(e73Var.mo3504c()) + iMo3579U3;
                int i75 = iMo3579U + iMo3579U2;
                int i76 = z11 ? iMo3579U4 : i75;
                if (z11) {
                    iMo3579U2 = iMo3579U3;
                } else if (!z11) {
                    iMo3579U2 = iMo3579U;
                }
                int i77 = i76 - iMo3579U2;
                long jM8017i = ll0.m8017i(-i75, j2, -iMo3579U4);
                hi2 hi2Var2 = (hi2) li2Var.f24049d.mo6400f();
                sg2 sg2Var = hi2Var2.f20599c;
                C0795je c0795je = hi2Var2.f20600d;
                int iM7539i = kl0.m7539i(jM8017i);
                int iM7538h = kl0.m7538h(jM8017i);
                sg2Var.f30240a.m133i(iM7539i);
                sg2Var.f30241b.m133i(iM7538h);
                if (z11) {
                    if (interfaceC1299wn == null) {
                        throw d55.m4375t("null verticalArrangement when isVertical == true");
                    }
                    fMo11068a = interfaceC1299wn.mo11068a();
                } else {
                    if (interfaceC1188tn == null) {
                        throw d55.m4375t("null horizontalAlignment when isVertical == false");
                    }
                    fMo11068a = interfaceC1188tn.mo11068a();
                }
                int iMo3579U5 = fe4Var.mo3579U(fMo11068a);
                int iM6409c = hi2Var2.m6409c();
                int iM7538h2 = z11 ? kl0.m7538h(j2) - iMo3579U4 : kl0.m7539i(j2) - i75;
                long j3 = (((long) iMo3579U) << 32) | (((long) iMo3579U3) & 4294967295L);
                C0779iz c0779iz = li2Var.f24055j;
                C0816jz c0816jz = li2Var.f24056k;
                ki2 ki2Var2 = new ki2();
                ki2Var2.f23143e = z11;
                ki2Var2.f23144f = oh2Var6;
                ki2Var2.f23145g = iM6409c;
                ki2Var2.f23146h = iMo3579U5;
                ki2Var2.f23147i = c0779iz;
                ki2Var2.f23148j = c0816jz;
                ki2Var2.f23149k = iMo3579U2;
                ki2Var2.f23150l = i77;
                ki2Var2.f23151m = j3;
                ki2Var2.f23152n = si2Var2;
                ki2Var2.f23139a = new lv2();
                ki2Var2.f23140b = hi2Var2;
                ki2Var2.f23141c = oh2Var6;
                ki2Var2.f23142d = ll0.m8010b(0, z11 ? kl0.m7539i(jM8017i) : Integer.MAX_VALUE, 0, z11 ? Integer.MAX_VALUE : kl0.m7538h(jM8017i), 5);
                VarHandle.storeStoreFence();
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    int iM10788g = si2Var2.m10788g();
                    int iM5546q2 = C0638f5.m5546q(hi2Var2, g90Var.f19664d, iM10788g);
                    if (iM10788g != iM5546q2) {
                        i2 = iMo3579U5;
                        ((a83) g90Var.f19662b).m133i(iM5546q2);
                        ph2 ph2Var = (ph2) g90Var.f19665e;
                        i3 = i77;
                        if (iM10788g != ph2Var.f27606b) {
                            ph2Var.f27606b = iM10788g;
                            int i78 = (iM10788g / 30) * 30;
                            ph2Var.f27605a.setValue(sc6.m10660c0(Math.max(i78 - 100, 0), i78 + 130));
                        }
                        iM132h = ((a83) g90Var.f19663c).m132h();
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        sh2 sh2Var = si2Var2.f30312r;
                        b30Var = si2Var2.f30309o;
                        abstractC0003a2M12171e = sh2Var.f30273a.m12171e();
                        uw2Var = b30Var.f15048a;
                        if (uw2Var.f32213c != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && abstractC0003a2M12171e.isEmpty()) {
                            kv2Var2 = k52.f22902a;
                            iM132h = iM132h;
                        } else {
                            kv2Var = new kv2();
                            if (b30Var.f15048a.f32213c != 0) {
                                i7 = uw2Var.f32213c;
                                if (i7 != 0) {
                                    objArr = uw2Var.f32211a;
                                    i4 = ((yg2) objArr[0]).f35211a;
                                    i8 = 0;
                                    while (i8 < i7) {
                                        int i79 = i8;
                                        i13 = ((yg2) objArr[i8]).f35211a;
                                        if (i13 < i4) {
                                            i4 = i13;
                                        }
                                        i8 = i79 + 1;
                                    }
                                    if (i4 < 0) {
                                        t32.m10968a("negative minIndex");
                                    }
                                    i9 = uw2Var.f32213c;
                                    if (i9 != 0) {
                                        objArr2 = uw2Var.f32211a;
                                        i10 = ((yg2) objArr2[0]).f35212b;
                                        for (i11 = 0; i11 < i9; i11++) {
                                            i12 = ((yg2) objArr2[i11]).f35212b;
                                            if (i12 > i10) {
                                                i10 = i12;
                                            }
                                        }
                                        iMin = Math.min(i10, hi2Var2.m6409c() - 1);
                                    } else {
                                        ds3.m4667k("MutableVector is empty.");
                                    }
                                } else {
                                    ds3.m4667k("MutableVector is empty.");
                                }
                                return null;
                            }
                            i4 = 1;
                            iMin = 0;
                            iMo103a = abstractC0003a2M12171e.mo103a();
                            for (i5 = 0; i5 < iMo103a; i5++) {
                                qh2 qh2Var = (qh2) abstractC0003a2M12171e.get(i5);
                                iM5546q = C0638f5.m5546q(hi2Var2, qh2Var.f28469a, qh2Var.f28471c);
                                if ((i4 <= iM5546q || iM5546q > iMin) && iM5546q >= 0 && iM5546q < hi2Var2.m6409c()) {
                                    kv2Var.m7633a(iM5546q);
                                }
                            }
                            if (i4 <= iMin) {
                                while (true) {
                                    kv2Var.m7633a(i4);
                                    if (i4 != iMin) {
                                        i4++;
                                    }
                                }
                            }
                            i6 = kv2Var.f23538b;
                            if (i6 != 0) {
                                Arrays.sort(kv2Var.f23537a, 0, i6);
                            }
                            kv2Var2 = kv2Var;
                        }
                        if (fe4Var.mo3587z() && z12) {
                            fFloatValue = ((Number) ((C0457ak) si2Var2.f30317w.f25811c).f14572b.getValue()).floatValue();
                        } else {
                            fFloatValue = si2Var2.f30302h;
                        }
                        z3 = li2Var.f24047b;
                        jh2Var = si2Var2.f30308n;
                        zMo3587z = fe4Var.mo3587z();
                        zo0Var = li2Var.f24052g;
                        sw2Var = si2Var2.f30316v;
                        au1Var = li2Var.f24053h;
                        h50Var = li2Var.f24054i;
                        if (iMo3579U2 < 0) {
                            t32.m10968a("invalid beforeContentPadding");
                        }
                        if (i3 < 0) {
                            t32.m10968a("invalid afterContentPadding");
                        }
                        w71Var = w71.f33134a;
                        v71Var = v71.f32439a;
                        if (iM6409c <= 0) {
                            iM7541k = kl0.m7541k(jM8017i);
                            iM7540j = kl0.m7540j(jM8017i);
                            jh2Var.m7125c(0, iM7541k, iM7540j, new ArrayList(), c0795je, ki2Var2, z3, zMo3587z, z12, 0, 0, zo0Var, au1Var);
                            if (!zMo3587z) {
                                jM7124a2 = jh2Var.m7124a();
                                if (!w52.m12108c(jM7124a2, 0L)) {
                                    iM7541k = ll0.m8015g((int) (jM7124a2 >> 32), jM8017i);
                                    iM7540j = ll0.m8014f((int) (jM7124a2 & 4294967295L), jM8017i);
                                }
                            }
                            yq2 yq2VarMo3583l0 = fe4Var.mo3583l0(ll0.m8015g(iM7541k + i75, j2), ll0.m8014f(iM7540j + iMo3579U4, j2), w71Var, new el1((byte) 19));
                            int i80 = -iMo3579U2;
                            int i81 = iM7538h2 + i3;
                            if (z3) {
                                d63Var2 = d63.f16814a;
                            } else {
                                d63Var2 = d63.f16815b;
                            }
                            mi2Var = new mi2(null, 0, false, 0.0f, yq2VarMo3583l0, 0.0f, false, zo0Var, oh2Var6, ki2Var2.f23142d, 0, v71Var, i80, i81, 0, d63Var2, i3, i2);
                            si2Var = si2Var2;
                            zq2Var = fe4Var;
                        } else {
                            j = jM8017i;
                            if (iM5546q2 >= iM6409c) {
                                ki2Var = ki2Var2;
                                iM5546q2 = iM6409c - 1;
                                iM132h = 0;
                            }
                            ki2Var = ki2Var2;
                            iRound = Math.round(fFloatValue);
                            i14 = iM132h - iRound;
                            if (iM5546q2 == 0 && i14 < 0) {
                                iRound += i14;
                                i14 = 0;
                            }
                            c0461ao = new C0461ao();
                            f = fFloatValue;
                            i15 = -iMo3579U2;
                            if (i2 < 0) {
                                i16 = i2;
                            } else {
                                i16 = 0;
                            }
                            sw2Var2 = sw2Var;
                            i17 = i15 + i16;
                            int i82 = i14 + i17;
                            si2Var = si2Var2;
                            iM8775b = i82;
                            w71Var2 = w71Var;
                            iMax = 0;
                            while (iM8775b < 0 && iM5546q2 > 0) {
                                iM5546q2--;
                                int i83 = i15;
                                ni2 ni2VarM7521a2 = ki2Var.m7521a(iM5546q2, ki2Var.f23142d);
                                c0461ao.add(0, ni2VarM7521a2);
                                iMax = Math.max(iMax, ni2VarM7521a2.f25865t);
                                iM8775b += ni2VarM7521a2.m8775b();
                                hi2Var2 = hi2Var2;
                                i15 = i83;
                            }
                            i18 = i15;
                            hi2 hi2Var3 = hi2Var2;
                            if (iM8775b < i17) {
                                iRound -= i17 - iM8775b;
                                iM8775b = i17;
                            }
                            int i84 = iM8775b - i17;
                            i19 = iM7538h2 + i3;
                            if (i19 < 0) {
                                i21 = i19;
                                i20 = 0;
                            } else {
                                i20 = i19;
                                i21 = i20;
                            }
                            iM8775b2 = -i84;
                            iM8775b3 = i84;
                            int i85 = iMax;
                            i22 = iM5546q2;
                            i23 = 0;
                            z4 = false;
                            while (i23 < c0461ao.f14719c) {
                                if (iM8775b2 >= i20) {
                                    c0461ao.mo3089b(i23);
                                    z4 = true;
                                } else {
                                    i22++;
                                    int iM8775b7 = ((ni2) c0461ao.get(i23)).m8775b() + iM8775b2;
                                    i23++;
                                    iM8775b2 = iM8775b7;
                                }
                            }
                            i24 = i22;
                            iMax2 = i85;
                            while (i24 < iM6409c && (iM8775b2 < i20 || iM8775b2 <= 0 || c0461ao.isEmpty())) {
                                fe4 fe4Var2 = fe4Var;
                                int i86 = iM6409c;
                                ni2VarM7521a = ki2Var.m7521a(i24, ki2Var.f23142d);
                                iM8775b2 += ni2VarM7521a.m8775b();
                                if (iM8775b2 <= i17 || i24 == i86 - 1) {
                                    int iMax6 = Math.max(iMax2, ni2VarM7521a.f25865t);
                                    c0461ao.addLast(ni2VarM7521a);
                                    iMax2 = iMax6;
                                } else {
                                    iM8775b3 -= ni2VarM7521a.m8775b();
                                    iM5546q2 = i24 + 1;
                                    z4 = true;
                                }
                                i24++;
                                fe4Var = fe4Var2;
                                iM6409c = i86;
                            }
                            if (iM8775b2 < iM7538h2) {
                                i69 = iM7538h2 - iM8775b2;
                                i70 = iM8775b2 + i69;
                                iM8775b4 = iM8775b3 - i69;
                                while (iM8775b4 < iMo3579U2 && iM5546q2 > 0) {
                                    iM5546q2--;
                                    int i87 = i70;
                                    ni2 ni2VarM7521a3 = ki2Var.m7521a(iM5546q2, ki2Var.f23142d);
                                    c0461ao.add(0, ni2VarM7521a3);
                                    iMax2 = Math.max(iMax2, ni2VarM7521a3.f25865t);
                                    iM8775b4 += ni2VarM7521a3.m8775b();
                                    i69 = i69;
                                    i70 = i87;
                                }
                                i71 = i70;
                                i25 = iRound + i69;
                                if (iM8775b4 < 0) {
                                    i25 += iM8775b4;
                                    iM8775b2 = i71 + iM8775b4;
                                    iM8775b4 = 0;
                                } else {
                                    iM8775b2 = i71;
                                }
                            } else {
                                i25 = iRound;
                                iM8775b4 = iM8775b3;
                            }
                            i26 = iMo3579U2;
                            if (Integer.signum(Math.round(f)) == Integer.signum(i25) || Math.abs(Math.round(f)) < Math.abs(i25)) {
                                f2 = f;
                            } else {
                                f2 = i25;
                            }
                            f3 = f - f2;
                            f4 = 0.0f;
                            if (zMo3587z && i25 > iRound && f3 <= 0.0f) {
                                f4 = (i25 - iRound) + f3;
                            }
                            f5 = f4;
                            if (iM8775b4 < 0) {
                                t32.m10968a("negative currentFirstItemScrollOffset");
                            }
                            i27 = -iM8775b4;
                            ni2 ni2Var8 = (ni2) c0461ao.first();
                            if (i26 <= 0 || i2 < 0) {
                                f6 = f5;
                                iMo3088a = c0461ao.mo3088a();
                                i28 = i27;
                                i29 = 0;
                                while (i29 < iMo3088a) {
                                    int i88 = iMo3088a;
                                    int iM8775b8 = ((ni2) c0461ao.get(i29)).m8775b();
                                    if (iM8775b4 == 0 && iM8775b8 <= iM8775b4 && i29 != kx5.m7689T(c0461ao)) {
                                        iM8775b4 -= iM8775b8;
                                        i29++;
                                        ni2Var8 = (ni2) c0461ao.get(i29);
                                        iMo3088a = i88;
                                    }
                                }
                            } else {
                                f6 = f5;
                                i28 = i27;
                            }
                            ni2Var = ni2Var8;
                            iMax3 = Math.max(0, iM5546q2);
                            i30 = iM5546q2 - 1;
                            if (iMax3 <= i30) {
                                arrayList = null;
                                while (true) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    i31 = i24;
                                    i32 = iMax2;
                                    arrayList.add(ki2Var.m7521a(i30, ki2Var.f23142d));
                                    if (i30 != iMax3) {
                                        i30--;
                                        i24 = i31;
                                        iMax2 = i32;
                                    }
                                }
                            } else {
                                i31 = i24;
                                i32 = iMax2;
                                arrayList = null;
                            }
                            iArr = kv2Var2.f23537a;
                            i33 = kv2Var2.f23538b - 1;
                            while (-1 < i33) {
                                i68 = iArr[i33];
                                if (i68 >= iMax3) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(ki2Var.m7521a(i68, ki2Var.f23142d));
                                }
                                i33--;
                                iArr = iArr;
                            }
                            if (arrayList == null) {
                                arrayList = v71Var;
                            }
                            list = arrayList;
                            size = list.size();
                            iMax4 = i32;
                            i34 = 0;
                            while (i34 < size) {
                                iMax4 = Math.max(iMax4, ((ni2) arrayList.get(i34)).f25865t);
                                i34++;
                                iM8775b4 = iM8775b4;
                            }
                            int i89 = iM8775b4;
                            iMin2 = Math.min(((ni2) hb0.m6306R0(c0461ao)).f25846a, iM6409c - 1);
                            i35 = ((ni2) hb0.m6306R0(c0461ao)).f25846a + 1;
                            if (i35 <= iMin2) {
                                arrayList2 = null;
                                while (true) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    list2 = arrayList;
                                    oh2Var = oh2Var6;
                                    arrayList2.add(ki2Var.m7521a(i35, ki2Var.f23142d));
                                    if (i35 != iMin2) {
                                        i35++;
                                        oh2Var6 = oh2Var;
                                        arrayList = list2;
                                    }
                                }
                            } else {
                                list2 = arrayList;
                                oh2Var = oh2Var6;
                                arrayList2 = null;
                            }
                            if (arrayList2 != null && ((ni2) hb0.m6306R0(arrayList2)).f25846a > iMin2) {
                                iMin2 = ((ni2) hb0.m6306R0(arrayList2)).f25846a;
                            }
                            iArr2 = kv2Var2.f23537a;
                            i36 = kv2Var2.f23538b;
                            i37 = 0;
                            while (i37 < i36) {
                                i67 = iArr2[i37];
                                if (i67 <= iMin2) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(ki2Var.m7521a(i67, ki2Var.f23142d));
                                }
                                i37++;
                                iMin2 = iMin2;
                                iArr2 = iArr2;
                            }
                            if (arrayList2 == null) {
                                arrayList2 = v71Var;
                            }
                            list3 = arrayList2;
                            size2 = list3.size();
                            for (i38 = 0; i38 < size2; i38++) {
                                iMax4 = Math.max(iMax4, ((ni2) arrayList2.get(i38)).f25865t);
                            }
                            if (!z62.m13387o(ni2Var, c0461ao.first()) && list2.isEmpty() && arrayList2.isEmpty()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z3) {
                                i39 = iMax4;
                            } else {
                                i39 = iM8775b2;
                            }
                            iM8015g = ll0.m8015g(i39, j);
                            if (z3) {
                                iMax4 = iM8775b2;
                            }
                            iM8014f = ll0.m8014f(iMax4, j);
                            if (z3) {
                                i40 = iM8014f;
                            } else {
                                i40 = iM8015g;
                            }
                            if (iM8775b2 < Math.min(i40, iM7538h2)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && i28 != 0) {
                                t32.m10970c("non-zero itemsScrollOffset");
                            }
                            int i90 = iM8775b2;
                            arrayList3 = new ArrayList(arrayList2.size() + list2.size() + c0461ao.mo3088a());
                            if (z6) {
                                if (list2.isEmpty() || !arrayList2.isEmpty()) {
                                    t32.m10968a("no extra items");
                                }
                                iMo3088a3 = c0461ao.mo3088a();
                                iArr3 = new int[iMo3088a3];
                                for (i61 = 0; i61 < iMo3088a3; i61++) {
                                    iArr3[i61] = ((ni2) c0461ao.get(i61)).f25860o;
                                }
                                iArr4 = new int[iMo3088a3];
                                if (z3) {
                                    oh2Var4 = oh2Var;
                                    if (interfaceC1188tn != null) {
                                        throw d55.m4375t("null horizontalArrangement when isVertical == false");
                                    }
                                    i62 = iM7538h2;
                                    oh2Var5 = oh2Var4;
                                    interfaceC1188tn.mo10373g(oh2Var5, i40, iArr3, df2.f17011a, iArr4);
                                } else {
                                    if (interfaceC1299wn != null) {
                                        throw d55.m4375t("null verticalArrangement when isVertical == true");
                                    }
                                    oh2 oh2Var7 = oh2Var;
                                    interfaceC1299wn.mo10874h(oh2Var7, i40, iArr3, iArr4);
                                    oh2Var5 = oh2Var7;
                                    i62 = iM7538h2;
                                }
                                r52 r52Var = new r52(0, iMo3088a3 - 1, 1);
                                i63 = r52Var.f27383b;
                                i64 = r52Var.f27384c;
                                if ((i64 <= 0 && i63 >= 0) || (i64 < 0 && i63 <= 0)) {
                                    i65 = 0;
                                    while (true) {
                                        int i91 = iArr4[i65];
                                        i66 = i64;
                                        ni2 ni2Var9 = (ni2) c0461ao.get(i65);
                                        ni2Var9.m8778e(i91, iM8015g, iM8014f);
                                        arrayList3.add(ni2Var9);
                                        if (i65 != i63) {
                                            i65 += i66;
                                            i64 = i66;
                                        }
                                    }
                                }
                                iM7538h2 = i62;
                                oh2Var3 = oh2Var5;
                            } else {
                                ki2Var = ki2Var;
                                iM8014f = iM8014f;
                                si2Var = si2Var;
                                w71Var2 = w71Var2;
                                i31 = i31;
                                oh2Var2 = oh2Var;
                                ni2Var = ni2Var;
                                j = j;
                                z5 = z5;
                                iM8015g = iM8015g;
                                sw2Var2 = sw2Var2;
                                size3 = list.size();
                                iM8775b5 = i28;
                                i41 = 0;
                                while (i41 < size3) {
                                    oh2 oh2Var8 = oh2Var2;
                                    ni2 ni2Var10 = (ni2) list2.get(i41);
                                    iM8775b5 -= ni2Var10.m8775b();
                                    ni2Var10.m8778e(iM8775b5, iM8015g, iM8014f);
                                    arrayList3.add(ni2Var10);
                                    i41++;
                                    oh2Var2 = oh2Var8;
                                }
                                oh2Var3 = oh2Var2;
                                iMo3088a2 = c0461ao.mo3088a();
                                iM8775b6 = i28;
                                for (i42 = 0; i42 < iMo3088a2; i42++) {
                                    ni2 ni2Var11 = (ni2) c0461ao.get(i42);
                                    ni2Var11.m8778e(iM8775b6, iM8015g, iM8014f);
                                    arrayList3.add(ni2Var11);
                                    iM8775b6 += ni2Var11.m8775b();
                                }
                                size4 = list3.size();
                                for (i43 = 0; i43 < size4; i43++) {
                                    ni2 ni2Var12 = (ni2) arrayList2.get(i43);
                                    ni2Var12.m8778e(iM8775b6, iM8015g, iM8014f);
                                    arrayList3.add(ni2Var12);
                                    iM8775b6 += ni2Var12.m8775b();
                                }
                            }
                            ki2 ki2Var3 = ki2Var;
                            jh2Var.m7125c((int) f2, iM8015g, iM8014f, arrayList3, c0795je, ki2Var3, z3, zMo3587z, z12, i89, i90, zo0Var, au1Var);
                            z7 = z3;
                            sw2 sw2Var4 = sw2Var2;
                            f7 = f2;
                            if (zMo3587z) {
                                i44 = iM7538h2;
                                z8 = zMo3587z;
                            } else {
                                jM7124a = jh2Var.m7124a();
                                i44 = iM7538h2;
                                if (!w52.m12108c(jM7124a, 0L)) {
                                    if (z7) {
                                        i58 = iM8014f;
                                    } else {
                                        i58 = iM8015g;
                                    }
                                    iM8015g = ll0.m8015g(Math.max(iM8015g, (int) (jM7124a >> 32)), j);
                                    iM8014f = ll0.m8014f(Math.max(iM8014f, (int) (jM7124a & 4294967295L)), j);
                                    if (z7) {
                                        i59 = iM8014f;
                                    } else {
                                        i59 = iM8015g;
                                    }
                                    if (i59 != i58) {
                                        size7 = arrayList3.size();
                                        for (i60 = 0; i60 < size7; i60++) {
                                            ni2 ni2Var13 = (ni2) arrayList3.get(i60);
                                            ni2Var13.f25867v = i59;
                                            ni2Var13.f25869x = ni2Var13.f25853h + i59;
                                        }
                                    }
                                }
                            }
                            z8 = zMo3587z;
                            if (c0461ao.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = c0461ao.f14718b[c0461ao.f14717a];
                            }
                            ni2Var2 = (ni2) obj4;
                            if (ni2Var2 != null) {
                                i45 = ni2Var2.f25846a;
                            } else {
                                i45 = 0;
                            }
                            ni2Var3 = (ni2) c0461ao.m3093l();
                            if (ni2Var3 != null) {
                                i46 = ni2Var3.f25846a;
                            } else {
                                i46 = 0;
                            }
                            hi2Var3.f20598b.getClass();
                            kv2 kv2Var4 = k52.f22902a;
                            if (h50Var != null || arrayList3.isEmpty() || (i52 = kv2Var4.f23538b) == 0) {
                                z9 = z7;
                                f8 = f7;
                                i47 = i18;
                                list4 = v71Var;
                            } else {
                                if (i46 - i45 < 0 || i52 == 0) {
                                    kv2Var3 = kv2Var4;
                                } else {
                                    r52 r52VarM10660c0 = sc6.m10660c0(0, i52);
                                    int i92 = r52VarM10660c0.f27382a;
                                    int i93 = r52VarM10660c0.f27383b;
                                    if (i92 <= i93) {
                                        iM7635c = -1;
                                        while (kv2Var4.m7635c(i92) <= i45) {
                                            iM7635c = kv2Var4.m7635c(i92);
                                            if (i92 != i93) {
                                                i92++;
                                            } else {
                                                i57 = -1;
                                            }
                                        }
                                        i57 = -1;
                                    } else {
                                        i57 = -1;
                                        iM7635c = -1;
                                    }
                                    if (iM7635c == i57) {
                                        kv2Var3 = k52.f22902a;
                                    } else {
                                        kv2Var3 = new kv2(1);
                                        kv2Var3.m7633a(iM7635c);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList(arrayList3.size());
                                int size8 = arrayList3.size();
                                int i94 = 0;
                                while (i94 < size8) {
                                    int i95 = size8;
                                    Object obj9 = arrayList3.get(i94);
                                    int i96 = i94;
                                    int i97 = ((ni2) obj9).f25846a;
                                    float f9 = f7;
                                    int[] iArr5 = kv2Var4.f23537a;
                                    int i98 = kv2Var4.f23538b;
                                    kv2 kv2Var5 = kv2Var4;
                                    int i99 = 0;
                                    while (i99 < i98) {
                                        int i100 = i99;
                                        if (iArr5[i100] == i97) {
                                            arrayList6.add(obj9);
                                        }
                                        i99 = i100 + 1;
                                        break;
                                    }
                                    i94 = i96 + 1;
                                    size8 = i95;
                                    f7 = f9;
                                    kv2Var4 = kv2Var5;
                                }
                                f8 = f7;
                                int[] iArr6 = kv2Var3.f23537a;
                                int i101 = kv2Var3.f23538b;
                                int i102 = 0;
                                while (i102 < i101) {
                                    int i103 = iArr6[i102];
                                    int size9 = arrayList3.size();
                                    int i104 = i101;
                                    int i105 = 0;
                                    int i106 = 0;
                                    while (true) {
                                        if (i105 < size9) {
                                            Object obj10 = arrayList3.get(i105);
                                            int i107 = i105 + 1;
                                            if (((ni2) obj10).f25846a == i103) {
                                                i53 = i106;
                                            } else {
                                                i106++;
                                                i105 = i107;
                                            }
                                        } else {
                                            i53 = -1;
                                        }
                                    }
                                    ni2 ni2VarM7521a4 = i53 == -1 ? ki2Var3.m7521a(i103, ki2Var3.f23142d) : (ni2) arrayList3.remove(i53);
                                    int iM5524D = C0638f5.m5524D(ni2VarM7521a4, z7);
                                    if (i53 == -1) {
                                        arrayList6 = arrayList6;
                                        i54 = Integer.MIN_VALUE;
                                    } else {
                                        long jM8776c = ni2VarM7521a4.m8776c(0);
                                        i54 = (int) (z7 ? jM8776c & 4294967295L : jM8776c >> 32);
                                    }
                                    int size10 = arrayList6.size();
                                    int i108 = 0;
                                    while (true) {
                                        if (i108 < size10) {
                                            obj6 = arrayList6.get(i108);
                                            arrayList4 = arrayList6;
                                            if (((ni2) obj6).f25846a == i103) {
                                                i108++;
                                                arrayList6 = arrayList4;
                                            }
                                        } else {
                                            arrayList4 = arrayList6;
                                            obj6 = null;
                                        }
                                    }
                                    ni2 ni2Var14 = (ni2) obj6;
                                    if (ni2Var14 != null) {
                                        long jM8776c2 = ni2Var14.m8776c(0);
                                        i55 = (int) (z7 ? jM8776c2 & 4294967295L : jM8776c2 >> 32);
                                    } else {
                                        z7 = z7;
                                        i102 = i102;
                                        i55 = Integer.MIN_VALUE;
                                    }
                                    if (i54 == Integer.MIN_VALUE) {
                                        iMax5 = i18;
                                        i56 = iMax5;
                                    } else {
                                        i56 = i18;
                                        iMax5 = Math.max(i56, i54);
                                    }
                                    if (i55 != Integer.MIN_VALUE) {
                                        iMax5 = Math.min(iMax5, i55 - iM5524D);
                                    }
                                    ni2VarM7521a4.f25866u = true;
                                    ni2VarM7521a4.m8778e(iMax5, iM8015g, iM8014f);
                                    ArrayList arrayList7 = arrayList5;
                                    arrayList7.add(ni2VarM7521a4);
                                    i102++;
                                    arrayList5 = arrayList7;
                                    i18 = i56;
                                    i101 = i104;
                                    iArr6 = iArr6;
                                    z7 = z7;
                                    arrayList6 = arrayList4;
                                }
                                list4 = arrayList5;
                                z9 = z7;
                                i47 = i18;
                            }
                            if (z5) {
                                ni2Var7 = (ni2) hb0.m6301M0(arrayList3);
                                if (ni2Var7 != null) {
                                    numValueOf = Integer.valueOf(ni2Var7.f25846a);
                                } else {
                                    numValueOf = null;
                                }
                            } else {
                                if (c0461ao.isEmpty()) {
                                    obj5 = null;
                                } else {
                                    obj5 = c0461ao.f14718b[c0461ao.f14717a];
                                }
                                ni2Var4 = (ni2) obj5;
                                if (ni2Var4 != null) {
                                    numValueOf = Integer.valueOf(ni2Var4.f25846a);
                                } else {
                                    numValueOf = null;
                                }
                            }
                            if (z5) {
                                ni2Var6 = (ni2) hb0.m6307S0(arrayList3);
                                if (ni2Var6 != null) {
                                    numValueOf2 = Integer.valueOf(ni2Var6.f25846a);
                                } else {
                                    numValueOf2 = null;
                                }
                            } else {
                                ni2Var5 = (ni2) c0461ao.m3093l();
                                if (ni2Var5 != null) {
                                    numValueOf2 = Integer.valueOf(ni2Var5.f25846a);
                                } else {
                                    numValueOf2 = null;
                                }
                            }
                            if (i31 >= iM6409c || i90 > i44) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            C0453ag c0453ag = new C0453ag((byte) 2);
                            c0453ag.f14444c = sw2Var4;
                            c0453ag.f14445d = arrayList3;
                            c0453ag.f14446e = list4;
                            c0453ag.f14443b = z8;
                            VarHandle.storeStoreFence();
                            zq2Var = fe4Var;
                            yq2 yq2VarMo3583l1 = zq2Var.mo3583l0(ll0.m8015g(iM8015g + i75, j2), ll0.m8014f(iM8014f + iMo3579U4, j2), w71Var2, c0453ag);
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (numValueOf2 != null) {
                                iIntValue2 = numValueOf2.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            if (arrayList3.isEmpty()) {
                                list5 = v71Var;
                            } else {
                                ArrayList arrayList8 = new ArrayList(list4);
                                size5 = arrayList3.size();
                                for (i48 = 0; i48 < size5; i48++) {
                                    ni2 ni2Var15 = (ni2) arrayList3.get(i48);
                                    i49 = ni2Var15.f25846a;
                                    if (iIntValue > i49 && i49 <= iIntValue2) {
                                        arrayList8.add(ni2Var15);
                                    }
                                }
                                lb0.m7891z0(arrayList8, C0638f5.f18754h);
                                list5 = arrayList8;
                            }
                            if (z9) {
                                d63Var = d63.f16814a;
                            } else {
                                d63Var = d63.f16815b;
                            }
                            d63 d63Var3 = d63Var;
                            long j4 = ki2Var3.f23142d;
                            size6 = list4.size();
                            i51 = 0;
                            for (i50 = 0; i50 < size6; i50++) {
                                i51 += ((ni2) list4.get(i50)).f25860o;
                            }
                            mi2Var = new mi2(ni2Var, i89, z10, f8, yq2VarMo3583l1, f6, z4, zo0Var, oh2Var3, j4, i51, list5, i47, i21, iM6409c, d63Var3, i3, i2);
                        }
                        mi2 mi2Var2 = mi2Var;
                        si2Var.m10787f(mi2Var2, zq2Var.mo3587z(), false);
                        return mi2Var2;
                    }
                    i2 = iMo3579U5;
                    i3 = i77;
                    iM132h = ((a83) g90Var.f19663c).m132h();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    sh2 sh2Var2 = si2Var2.f30312r;
                    b30Var = si2Var2.f30309o;
                    abstractC0003a2M12171e = sh2Var2.f30273a.m12171e();
                    uw2Var = b30Var.f15048a;
                    if (uw2Var.f32213c != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        kv2Var = new kv2();
                        if (b30Var.f15048a.f32213c != 0) {
                            i7 = uw2Var.f32213c;
                            if (i7 != 0) {
                                objArr = uw2Var.f32211a;
                                i4 = ((yg2) objArr[0]).f35211a;
                                i8 = 0;
                                while (i8 < i7) {
                                    int i710 = i8;
                                    i13 = ((yg2) objArr[i8]).f35211a;
                                    if (i13 < i4) {
                                        i4 = i13;
                                    }
                                    i8 = i710 + 1;
                                }
                                if (i4 < 0) {
                                    t32.m10968a("negative minIndex");
                                }
                                i9 = uw2Var.f32213c;
                                if (i9 != 0) {
                                    objArr2 = uw2Var.f32211a;
                                    i10 = ((yg2) objArr2[0]).f35212b;
                                    while (i11 < i9) {
                                        i12 = ((yg2) objArr2[i11]).f35212b;
                                        if (i12 > i10) {
                                            i10 = i12;
                                        }
                                    }
                                    iMin = Math.min(i10, hi2Var2.m6409c() - 1);
                                } else {
                                    ds3.m4667k("MutableVector is empty.");
                                }
                            } else {
                                ds3.m4667k("MutableVector is empty.");
                            }
                            return null;
                        }
                        i4 = 1;
                        iMin = 0;
                        iMo103a = abstractC0003a2M12171e.mo103a();
                        while (i5 < iMo103a) {
                            qh2 qh2Var2 = (qh2) abstractC0003a2M12171e.get(i5);
                            iM5546q = C0638f5.m5546q(hi2Var2, qh2Var2.f28469a, qh2Var2.f28471c);
                            if (i4 <= iM5546q) {
                                kv2Var.m7633a(iM5546q);
                            } else {
                                kv2Var.m7633a(iM5546q);
                            }
                        }
                        if (i4 <= iMin) {
                            while (true) {
                                kv2Var.m7633a(i4);
                                if (i4 != iMin) {
                                    i4++;
                                }
                            }
                        }
                        i6 = kv2Var.f23538b;
                        if (i6 != 0) {
                            Arrays.sort(kv2Var.f23537a, 0, i6);
                        }
                        kv2Var2 = kv2Var;
                    } else {
                        kv2Var = new kv2();
                        if (b30Var.f15048a.f32213c != 0) {
                            i7 = uw2Var.f32213c;
                            if (i7 != 0) {
                                objArr = uw2Var.f32211a;
                                i4 = ((yg2) objArr[0]).f35211a;
                                i8 = 0;
                                while (i8 < i7) {
                                    int i711 = i8;
                                    i13 = ((yg2) objArr[i8]).f35211a;
                                    if (i13 < i4) {
                                        i4 = i13;
                                    }
                                    i8 = i711 + 1;
                                }
                                if (i4 < 0) {
                                    t32.m10968a("negative minIndex");
                                }
                                i9 = uw2Var.f32213c;
                                if (i9 != 0) {
                                    objArr2 = uw2Var.f32211a;
                                    i10 = ((yg2) objArr2[0]).f35212b;
                                    while (i11 < i9) {
                                        i12 = ((yg2) objArr2[i11]).f35212b;
                                        if (i12 > i10) {
                                            i10 = i12;
                                        }
                                    }
                                    iMin = Math.min(i10, hi2Var2.m6409c() - 1);
                                } else {
                                    ds3.m4667k("MutableVector is empty.");
                                }
                            } else {
                                ds3.m4667k("MutableVector is empty.");
                            }
                            return null;
                        }
                        i4 = 1;
                        iMin = 0;
                        iMo103a = abstractC0003a2M12171e.mo103a();
                        while (i5 < iMo103a) {
                            qh2 qh2Var3 = (qh2) abstractC0003a2M12171e.get(i5);
                            iM5546q = C0638f5.m5546q(hi2Var2, qh2Var3.f28469a, qh2Var3.f28471c);
                            if (i4 <= iM5546q) {
                                kv2Var.m7633a(iM5546q);
                            } else {
                                kv2Var.m7633a(iM5546q);
                            }
                        }
                        if (i4 <= iMin) {
                            while (true) {
                                kv2Var.m7633a(i4);
                                if (i4 != iMin) {
                                    i4++;
                                }
                            }
                        }
                        i6 = kv2Var.f23538b;
                        if (i6 != 0) {
                            Arrays.sort(kv2Var.f23537a, 0, i6);
                        }
                        kv2Var2 = kv2Var;
                    }
                    if (fe4Var.mo3587z()) {
                        fFloatValue = si2Var2.f30302h;
                    } else {
                        fFloatValue = si2Var2.f30302h;
                    }
                    z3 = li2Var.f24047b;
                    jh2Var = si2Var2.f30308n;
                    zMo3587z = fe4Var.mo3587z();
                    zo0Var = li2Var.f24052g;
                    sw2Var = si2Var2.f30316v;
                    au1Var = li2Var.f24053h;
                    h50Var = li2Var.f24054i;
                    if (iMo3579U2 < 0) {
                        t32.m10968a("invalid beforeContentPadding");
                    }
                    if (i3 < 0) {
                        t32.m10968a("invalid afterContentPadding");
                    }
                    w71Var = w71.f33134a;
                    v71Var = v71.f32439a;
                    if (iM6409c <= 0) {
                        iM7541k = kl0.m7541k(jM8017i);
                        iM7540j = kl0.m7540j(jM8017i);
                        jh2Var.m7125c(0, iM7541k, iM7540j, new ArrayList(), c0795je, ki2Var2, z3, zMo3587z, z12, 0, 0, zo0Var, au1Var);
                        if (!zMo3587z) {
                            jM7124a2 = jh2Var.m7124a();
                            if (!w52.m12108c(jM7124a2, 0L)) {
                                iM7541k = ll0.m8015g((int) (jM7124a2 >> 32), jM8017i);
                                iM7540j = ll0.m8014f((int) (jM7124a2 & 4294967295L), jM8017i);
                            }
                        }
                        yq2 yq2VarMo3583l2 = fe4Var.mo3583l0(ll0.m8015g(iM7541k + i75, j2), ll0.m8014f(iM7540j + iMo3579U4, j2), w71Var, new el1((byte) 19));
                        int i810 = -iMo3579U2;
                        int i811 = iM7538h2 + i3;
                        if (z3) {
                            d63Var2 = d63.f16814a;
                        } else {
                            d63Var2 = d63.f16815b;
                        }
                        mi2Var = new mi2(null, 0, false, 0.0f, yq2VarMo3583l2, 0.0f, false, zo0Var, oh2Var6, ki2Var2.f23142d, 0, v71Var, i810, i811, 0, d63Var2, i3, i2);
                        si2Var = si2Var2;
                        zq2Var = fe4Var;
                    } else {
                        j = jM8017i;
                        if (iM5546q2 >= iM6409c) {
                            ki2Var = ki2Var2;
                            iM5546q2 = iM6409c - 1;
                            iM132h = 0;
                        }
                        ki2Var = ki2Var2;
                        iRound = Math.round(fFloatValue);
                        i14 = iM132h - iRound;
                        if (iM5546q2 == 0) {
                            iRound += i14;
                            i14 = 0;
                        }
                        c0461ao = new C0461ao();
                        f = fFloatValue;
                        i15 = -iMo3579U2;
                        if (i2 < 0) {
                            i16 = i2;
                        } else {
                            i16 = 0;
                        }
                        sw2Var2 = sw2Var;
                        i17 = i15 + i16;
                        int i812 = i14 + i17;
                        si2Var = si2Var2;
                        iM8775b = i812;
                        w71Var2 = w71Var;
                        iMax = 0;
                        while (iM8775b < 0) {
                            iM5546q2--;
                            int i813 = i15;
                            ni2 ni2VarM7521a5 = ki2Var.m7521a(iM5546q2, ki2Var.f23142d);
                            c0461ao.add(0, ni2VarM7521a5);
                            iMax = Math.max(iMax, ni2VarM7521a5.f25865t);
                            iM8775b += ni2VarM7521a5.m8775b();
                            hi2Var2 = hi2Var2;
                            i15 = i813;
                        }
                        i18 = i15;
                        hi2 hi2Var4 = hi2Var2;
                        if (iM8775b < i17) {
                            iRound -= i17 - iM8775b;
                            iM8775b = i17;
                        }
                        int i814 = iM8775b - i17;
                        i19 = iM7538h2 + i3;
                        if (i19 < 0) {
                            i21 = i19;
                            i20 = 0;
                        } else {
                            i20 = i19;
                            i21 = i20;
                        }
                        iM8775b2 = -i814;
                        iM8775b3 = i814;
                        int i815 = iMax;
                        i22 = iM5546q2;
                        i23 = 0;
                        z4 = false;
                        while (i23 < c0461ao.f14719c) {
                            if (iM8775b2 >= i20) {
                                c0461ao.mo3089b(i23);
                                z4 = true;
                            } else {
                                i22++;
                                int iM8775b9 = ((ni2) c0461ao.get(i23)).m8775b() + iM8775b2;
                                i23++;
                                iM8775b2 = iM8775b9;
                            }
                        }
                        i24 = i22;
                        iMax2 = i815;
                        while (i24 < iM6409c) {
                            fe4 fe4Var3 = fe4Var;
                            int i816 = iM6409c;
                            ni2VarM7521a = ki2Var.m7521a(i24, ki2Var.f23142d);
                            iM8775b2 += ni2VarM7521a.m8775b();
                            if (iM8775b2 <= i17) {
                                int iMax7 = Math.max(iMax2, ni2VarM7521a.f25865t);
                                c0461ao.addLast(ni2VarM7521a);
                                iMax2 = iMax7;
                            } else {
                                int iMax8 = Math.max(iMax2, ni2VarM7521a.f25865t);
                                c0461ao.addLast(ni2VarM7521a);
                                iMax2 = iMax8;
                            }
                            i24++;
                            fe4Var = fe4Var3;
                            iM6409c = i816;
                        }
                        if (iM8775b2 < iM7538h2) {
                            i69 = iM7538h2 - iM8775b2;
                            i70 = iM8775b2 + i69;
                            iM8775b4 = iM8775b3 - i69;
                            while (iM8775b4 < iMo3579U2) {
                                iM5546q2--;
                                int i817 = i70;
                                ni2 ni2VarM7521a6 = ki2Var.m7521a(iM5546q2, ki2Var.f23142d);
                                c0461ao.add(0, ni2VarM7521a6);
                                iMax2 = Math.max(iMax2, ni2VarM7521a6.f25865t);
                                iM8775b4 += ni2VarM7521a6.m8775b();
                                i69 = i69;
                                i70 = i817;
                            }
                            i71 = i70;
                            i25 = iRound + i69;
                            if (iM8775b4 < 0) {
                                i25 += iM8775b4;
                                iM8775b2 = i71 + iM8775b4;
                                iM8775b4 = 0;
                            } else {
                                iM8775b2 = i71;
                            }
                        } else {
                            i25 = iRound;
                            iM8775b4 = iM8775b3;
                        }
                        i26 = iMo3579U2;
                        if (Integer.signum(Math.round(f)) == Integer.signum(i25)) {
                            f2 = f;
                        } else {
                            f2 = f;
                        }
                        f3 = f - f2;
                        f4 = 0.0f;
                        if (zMo3587z) {
                            f4 = (i25 - iRound) + f3;
                        }
                        f5 = f4;
                        if (iM8775b4 < 0) {
                            t32.m10968a("negative currentFirstItemScrollOffset");
                        }
                        i27 = -iM8775b4;
                        ni2 ni2Var16 = (ni2) c0461ao.first();
                        if (i26 <= 0) {
                            f6 = f5;
                            iMo3088a = c0461ao.mo3088a();
                            i28 = i27;
                            i29 = 0;
                            while (i29 < iMo3088a) {
                                int i818 = iMo3088a;
                                int iM8775b10 = ((ni2) c0461ao.get(i29)).m8775b();
                                if (iM8775b4 == 0) {
                                }
                            }
                        } else {
                            f6 = f5;
                            iMo3088a = c0461ao.mo3088a();
                            i28 = i27;
                            i29 = 0;
                            while (i29 < iMo3088a) {
                                int i819 = iMo3088a;
                                int iM8775b11 = ((ni2) c0461ao.get(i29)).m8775b();
                                if (iM8775b4 == 0) {
                                }
                            }
                        }
                        ni2Var = ni2Var16;
                        iMax3 = Math.max(0, iM5546q2);
                        i30 = iM5546q2 - 1;
                        if (iMax3 <= i30) {
                            arrayList = null;
                            while (true) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                i31 = i24;
                                i32 = iMax2;
                                arrayList.add(ki2Var.m7521a(i30, ki2Var.f23142d));
                                if (i30 != iMax3) {
                                    i30--;
                                    i24 = i31;
                                    iMax2 = i32;
                                }
                            }
                        } else {
                            i31 = i24;
                            i32 = iMax2;
                            arrayList = null;
                        }
                        iArr = kv2Var2.f23537a;
                        i33 = kv2Var2.f23538b - 1;
                        while (-1 < i33) {
                            i68 = iArr[i33];
                            if (i68 >= iMax3) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(ki2Var.m7521a(i68, ki2Var.f23142d));
                            }
                            i33--;
                            iArr = iArr;
                        }
                        if (arrayList == null) {
                            arrayList = v71Var;
                        }
                        list = arrayList;
                        size = list.size();
                        iMax4 = i32;
                        i34 = 0;
                        while (i34 < size) {
                            iMax4 = Math.max(iMax4, ((ni2) arrayList.get(i34)).f25865t);
                            i34++;
                            iM8775b4 = iM8775b4;
                        }
                        int i820 = iM8775b4;
                        iMin2 = Math.min(((ni2) hb0.m6306R0(c0461ao)).f25846a, iM6409c - 1);
                        i35 = ((ni2) hb0.m6306R0(c0461ao)).f25846a + 1;
                        if (i35 <= iMin2) {
                            arrayList2 = null;
                            while (true) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                list2 = arrayList;
                                oh2Var = oh2Var6;
                                arrayList2.add(ki2Var.m7521a(i35, ki2Var.f23142d));
                                if (i35 != iMin2) {
                                    i35++;
                                    oh2Var6 = oh2Var;
                                    arrayList = list2;
                                }
                            }
                        } else {
                            list2 = arrayList;
                            oh2Var = oh2Var6;
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            iMin2 = ((ni2) hb0.m6306R0(arrayList2)).f25846a;
                        }
                        iArr2 = kv2Var2.f23537a;
                        i36 = kv2Var2.f23538b;
                        i37 = 0;
                        while (i37 < i36) {
                            i67 = iArr2[i37];
                            if (i67 <= iMin2) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(ki2Var.m7521a(i67, ki2Var.f23142d));
                            }
                            i37++;
                            iMin2 = iMin2;
                            iArr2 = iArr2;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = v71Var;
                        }
                        list3 = arrayList2;
                        size2 = list3.size();
                        while (i38 < size2) {
                            iMax4 = Math.max(iMax4, ((ni2) arrayList2.get(i38)).f25865t);
                        }
                        if (!z62.m13387o(ni2Var, c0461ao.first())) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z3) {
                            i39 = iMax4;
                        } else {
                            i39 = iM8775b2;
                        }
                        iM8015g = ll0.m8015g(i39, j);
                        if (z3) {
                            iMax4 = iM8775b2;
                        }
                        iM8014f = ll0.m8014f(iMax4, j);
                        if (z3) {
                            i40 = iM8014f;
                        } else {
                            i40 = iM8015g;
                        }
                        if (iM8775b2 < Math.min(i40, iM7538h2)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            t32.m10970c("non-zero itemsScrollOffset");
                        }
                        int i910 = iM8775b2;
                        arrayList3 = new ArrayList(arrayList2.size() + list2.size() + c0461ao.mo3088a());
                        if (z6) {
                            if (list2.isEmpty()) {
                                t32.m10968a("no extra items");
                            } else {
                                t32.m10968a("no extra items");
                            }
                            iMo3088a3 = c0461ao.mo3088a();
                            iArr3 = new int[iMo3088a3];
                            while (i61 < iMo3088a3) {
                                iArr3[i61] = ((ni2) c0461ao.get(i61)).f25860o;
                            }
                            iArr4 = new int[iMo3088a3];
                            if (z3) {
                                oh2Var4 = oh2Var;
                                if (interfaceC1188tn != null) {
                                    throw d55.m4375t("null horizontalArrangement when isVertical == false");
                                }
                                i62 = iM7538h2;
                                oh2Var5 = oh2Var4;
                                interfaceC1188tn.mo10373g(oh2Var5, i40, iArr3, df2.f17011a, iArr4);
                            } else {
                                if (interfaceC1299wn != null) {
                                    throw d55.m4375t("null verticalArrangement when isVertical == true");
                                }
                                oh2 oh2Var9 = oh2Var;
                                interfaceC1299wn.mo10874h(oh2Var9, i40, iArr3, iArr4);
                                oh2Var5 = oh2Var9;
                                i62 = iM7538h2;
                            }
                            r52 r52Var2 = new r52(0, iMo3088a3 - 1, 1);
                            i63 = r52Var2.f27383b;
                            i64 = r52Var2.f27384c;
                            if (i64 <= 0) {
                                i65 = 0;
                                while (true) {
                                    int i911 = iArr4[i65];
                                    i66 = i64;
                                    ni2 ni2Var17 = (ni2) c0461ao.get(i65);
                                    ni2Var17.m8778e(i911, iM8015g, iM8014f);
                                    arrayList3.add(ni2Var17);
                                    if (i65 != i63) {
                                        i65 += i66;
                                        i64 = i66;
                                    }
                                }
                            } else {
                                i65 = 0;
                                while (true) {
                                    int i912 = iArr4[i65];
                                    i66 = i64;
                                    ni2 ni2Var18 = (ni2) c0461ao.get(i65);
                                    ni2Var18.m8778e(i912, iM8015g, iM8014f);
                                    arrayList3.add(ni2Var18);
                                    if (i65 != i63) {
                                        i65 += i66;
                                        i64 = i66;
                                    }
                                }
                            }
                            iM7538h2 = i62;
                            oh2Var3 = oh2Var5;
                        } else {
                            ki2Var = ki2Var;
                            iM8014f = iM8014f;
                            si2Var = si2Var;
                            w71Var2 = w71Var2;
                            i31 = i31;
                            oh2Var2 = oh2Var;
                            ni2Var = ni2Var;
                            j = j;
                            z5 = z5;
                            iM8015g = iM8015g;
                            sw2Var2 = sw2Var2;
                            size3 = list.size();
                            iM8775b5 = i28;
                            i41 = 0;
                            while (i41 < size3) {
                                oh2 oh2Var10 = oh2Var2;
                                ni2 ni2Var19 = (ni2) list2.get(i41);
                                iM8775b5 -= ni2Var19.m8775b();
                                ni2Var19.m8778e(iM8775b5, iM8015g, iM8014f);
                                arrayList3.add(ni2Var19);
                                i41++;
                                oh2Var2 = oh2Var10;
                            }
                            oh2Var3 = oh2Var2;
                            iMo3088a2 = c0461ao.mo3088a();
                            iM8775b6 = i28;
                            while (i42 < iMo3088a2) {
                                ni2 ni2Var110 = (ni2) c0461ao.get(i42);
                                ni2Var110.m8778e(iM8775b6, iM8015g, iM8014f);
                                arrayList3.add(ni2Var110);
                                iM8775b6 += ni2Var110.m8775b();
                            }
                            size4 = list3.size();
                            while (i43 < size4) {
                                ni2 ni2Var111 = (ni2) arrayList2.get(i43);
                                ni2Var111.m8778e(iM8775b6, iM8015g, iM8014f);
                                arrayList3.add(ni2Var111);
                                iM8775b6 += ni2Var111.m8775b();
                            }
                        }
                        ki2 ki2Var4 = ki2Var;
                        jh2Var.m7125c((int) f2, iM8015g, iM8014f, arrayList3, c0795je, ki2Var4, z3, zMo3587z, z12, i820, i910, zo0Var, au1Var);
                        z7 = z3;
                        sw2 sw2Var5 = sw2Var2;
                        f7 = f2;
                        if (zMo3587z) {
                            jM7124a = jh2Var.m7124a();
                            i44 = iM7538h2;
                            if (!w52.m12108c(jM7124a, 0L)) {
                                if (z7) {
                                    i58 = iM8014f;
                                } else {
                                    i58 = iM8015g;
                                }
                                iM8015g = ll0.m8015g(Math.max(iM8015g, (int) (jM7124a >> 32)), j);
                                iM8014f = ll0.m8014f(Math.max(iM8014f, (int) (jM7124a & 4294967295L)), j);
                                if (z7) {
                                    i59 = iM8014f;
                                } else {
                                    i59 = iM8015g;
                                }
                                if (i59 != i58) {
                                    size7 = arrayList3.size();
                                    while (i60 < size7) {
                                        ni2 ni2Var112 = (ni2) arrayList3.get(i60);
                                        ni2Var112.f25867v = i59;
                                        ni2Var112.f25869x = ni2Var112.f25853h + i59;
                                    }
                                }
                            }
                        } else {
                            i44 = iM7538h2;
                            z8 = zMo3587z;
                        }
                        z8 = zMo3587z;
                        if (c0461ao.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = c0461ao.f14718b[c0461ao.f14717a];
                        }
                        ni2Var2 = (ni2) obj4;
                        if (ni2Var2 != null) {
                            i45 = ni2Var2.f25846a;
                        } else {
                            i45 = 0;
                        }
                        ni2Var3 = (ni2) c0461ao.m3093l();
                        if (ni2Var3 != null) {
                            i46 = ni2Var3.f25846a;
                        } else {
                            i46 = 0;
                        }
                        hi2Var4.f20598b.getClass();
                        kv2 kv2Var6 = k52.f22902a;
                        if (h50Var != null) {
                            z9 = z7;
                            f8 = f7;
                            i47 = i18;
                            list4 = v71Var;
                        } else {
                            z9 = z7;
                            f8 = f7;
                            i47 = i18;
                            list4 = v71Var;
                        }
                        if (z5) {
                            ni2Var7 = (ni2) hb0.m6301M0(arrayList3);
                            if (ni2Var7 != null) {
                                numValueOf = Integer.valueOf(ni2Var7.f25846a);
                            } else {
                                numValueOf = null;
                            }
                        } else {
                            if (c0461ao.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = c0461ao.f14718b[c0461ao.f14717a];
                            }
                            ni2Var4 = (ni2) obj5;
                            if (ni2Var4 != null) {
                                numValueOf = Integer.valueOf(ni2Var4.f25846a);
                            } else {
                                numValueOf = null;
                            }
                        }
                        if (z5) {
                            ni2Var6 = (ni2) hb0.m6307S0(arrayList3);
                            if (ni2Var6 != null) {
                                numValueOf2 = Integer.valueOf(ni2Var6.f25846a);
                            } else {
                                numValueOf2 = null;
                            }
                        } else {
                            ni2Var5 = (ni2) c0461ao.m3093l();
                            if (ni2Var5 != null) {
                                numValueOf2 = Integer.valueOf(ni2Var5.f25846a);
                            } else {
                                numValueOf2 = null;
                            }
                        }
                        if (i31 >= iM6409c) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        C0453ag c0453ag2 = new C0453ag((byte) 2);
                        c0453ag2.f14444c = sw2Var5;
                        c0453ag2.f14445d = arrayList3;
                        c0453ag2.f14446e = list4;
                        c0453ag2.f14443b = z8;
                        VarHandle.storeStoreFence();
                        zq2Var = fe4Var;
                        yq2 yq2VarMo3583l3 = zq2Var.mo3583l0(ll0.m8015g(iM8015g + i75, j2), ll0.m8014f(iM8014f + iMo3579U4, j2), w71Var2, c0453ag2);
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (numValueOf2 != null) {
                            iIntValue2 = numValueOf2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (arrayList3.isEmpty()) {
                            list5 = v71Var;
                        } else {
                            ArrayList arrayList9 = new ArrayList(list4);
                            size5 = arrayList3.size();
                            while (i48 < size5) {
                                ni2 ni2Var113 = (ni2) arrayList3.get(i48);
                                i49 = ni2Var113.f25846a;
                                if (iIntValue > i49) {
                                }
                            }
                            lb0.m7891z0(arrayList9, C0638f5.f18754h);
                            list5 = arrayList9;
                        }
                        if (z9) {
                            d63Var = d63.f16814a;
                        } else {
                            d63Var = d63.f16815b;
                        }
                        d63 d63Var4 = d63Var;
                        long j5 = ki2Var4.f23142d;
                        size6 = list4.size();
                        i51 = 0;
                        while (i50 < size6) {
                            i51 += ((ni2) list4.get(i50)).f25860o;
                        }
                        mi2Var = new mi2(ni2Var, i820, z10, f8, yq2VarMo3583l3, f6, z4, zo0Var, oh2Var3, j5, i51, list5, i47, i21, iM6409c, d63Var4, i3, i2);
                    }
                    mi2 mi2Var3 = mi2Var;
                    si2Var.m10787f(mi2Var3, zq2Var.mo3587z(), false);
                    return mi2Var3;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            case 5:
                pg0 pg0Var = (pg0) this.f18412b;
                vi2 vi2Var = (vi2) this.f18413c;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pg0Var.invoke(vi2Var, ir1Var4, 0);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 6:
                ((Integer) obj2).getClass();
                zc6.m13519d((lk2) this.f18412b, (yp1) this.f18413c, (mi0) obj, vd6.m11838V(391));
                return ju4Var;
            case 7:
                return m5292b(obj, obj2);
            case 8:
                return m5293e(obj, obj2);
            case 9:
                return m5294f(obj, obj2);
            case 10:
                return m5295h(obj, obj2);
            case 11:
                nl3 nl3Var = (nl3) this.f18412b;
                tx3 tx3Var = (tx3) this.f18413c;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f10 = nl3Var.f25933a;
                nl3Var.f25933a = tx3Var.mo3369a(fFloatValue2 - f10) + f10;
                return ju4Var;
            case 12:
                return m5296i(obj, obj2);
            case 13:
                return m5297j(obj, obj2);
            case 14:
                return m5298k(obj, obj2);
            case 15:
                return m5299l(obj, obj2);
            case 16:
                return m5300m(obj, obj2);
            case 17:
                return m5301n(obj, obj2);
            case 18:
                return m5302o(obj, obj2);
            case 19:
                return m5303p(obj, obj2);
            case 20:
                return m5304q(obj, obj2);
            case 21:
                return m5305r(obj, obj2);
            case 22:
                return m5306s(obj, obj2);
            default:
                String str2 = (String) this.f18412b;
                pn0 pn0Var = (pn0) this.f18413c;
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (str2 != null) {
                        str = str2;
                    } else {
                        String title = pn0Var != null ? pn0Var.getTitle() : null;
                        if (title == null) {
                            str2 = "None";
                            str = str2;
                        } else {
                            str = title;
                        }
                    }
                    gl4.m6037b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var5, 0, 0, 262142);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
        }
    }
}
