package p000;

import ads_mobile_sdk.C0341tf;
import android.app.Activity;
import android.app.KeyguardManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: pe */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1031pe extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f27552t;

    /* JADX INFO: renamed from: u */
    public boolean f27553u;

    /* JADX INFO: renamed from: v */
    public Object f27554v;

    /* JADX INFO: renamed from: w */
    public Object f27555w;

    /* JADX INFO: renamed from: x */
    public Object f27556x;

    /* JADX INFO: renamed from: y */
    public Object f27557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(yp1 yp1Var, mq1 mq1Var, yp1 yp1Var2, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 18;
        this.f27555w = yp1Var;
        this.f27554v = mq1Var;
        this.f27556x = yp1Var2;
        this.f27557y = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f27552t) {
            case 0:
                C1031pe c1031pe = new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 0);
                c1031pe.f27554v = obj;
                return c1031pe;
            case 1:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 1);
            case 2:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 2);
            case 3:
                return new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 3);
            case 4:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 4);
            case 5:
                C1031pe c1031pe2 = new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 5);
                c1031pe2.f27554v = obj;
                return c1031pe2;
            case 6:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 6);
            case 7:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 7);
            case 8:
                C1031pe c1031pe3 = new C1031pe((C0459am) this.f27557y, (yp1) this.f27555w, wm0Var);
                c1031pe3.f27554v = obj;
                return c1031pe3;
            case 9:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 9);
            case 10:
                C1031pe c1031pe4 = new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 10);
                c1031pe4.f27554v = obj;
                return c1031pe4;
            case 11:
                return new C1031pe((KeyguardManager) this.f27554v, (Activity) this.f27556x, (xn2) this.f27557y, (yp1) this.f27555w, wm0Var);
            case 12:
                C1031pe c1031pe5 = new C1031pe((ql3) this.f27556x, (v21) this.f27557y, wm0Var);
                c1031pe5.f27554v = obj;
                return c1031pe5;
            case 13:
                C1031pe c1031pe6 = new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 13);
                c1031pe6.f27554v = obj;
                return c1031pe6;
            case 14:
                C1031pe c1031pe7 = new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 14);
                c1031pe7.f27554v = obj;
                return c1031pe7;
            case 15:
                return new C1031pe((yp1) this.f27554v, (pz2) this.f27556x, (kr3) this.f27557y, wm0Var);
            case 16:
                C1031pe c1031pe8 = new C1031pe(this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 16);
                c1031pe8.f27554v = obj;
                return c1031pe8;
            case 17:
                return new C1031pe((yp1) this.f27555w, (mq1) this.f27557y, wm0Var);
            case 18:
                return new C1031pe((yp1) this.f27555w, (mq1) this.f27554v, (yp1) this.f27556x, (sw2) this.f27557y, wm0Var);
            case 19:
                return new C1031pe(this.f27554v, wm0Var, (InterfaceC0755ia) this.f27555w, (LinkedHashMap) this.f27556x, (Map) this.f27557y);
            case 20:
                return new C1031pe((List) this.f27557y, wm0Var);
            case 21:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 21);
            case 22:
                C1031pe c1031pe9 = new C1031pe((pc3) this.f27556x, (nq1) this.f27557y, (yp1) this.f27555w, wm0Var);
                c1031pe9.f27554v = obj;
                return c1031pe9;
            case 23:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 23);
            case 24:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 24);
            case 25:
                return new C1031pe(wm0Var, (C0751i6) this.f27554v, (C0341tf) this.f27555w, (Set) this.f27556x);
            case 26:
                return new C1031pe((String) this.f27554v, (ua5) this.f27555w, wm0Var, this.f27556x, this.f27557y, (byte) 26);
            case 27:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 27);
            case 28:
                return new C1031pe((String) this.f27554v, (ua5) this.f27555w, wm0Var, this.f27556x, this.f27557y, (byte) 28);
            default:
                return new C1031pe(this.f27554v, this.f27555w, this.f27556x, this.f27557y, wm0Var, (byte) 29);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.f27552t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((C1031pe) create((wm0) obj2, (C0723hf) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 1:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C1031pe) create((wm0) obj2, (mg3) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C1031pe) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 12:
                return ((C1031pe) create((wm0) obj2, (yp1) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((C1031pe) create((wm0) obj2, (vv0) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 15:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 16:
                return ((C1031pe) create((wm0) obj2, (j54) obj)).invokeSuspend(ju4Var);
            case 17:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 18:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 19:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 20:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 21:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 22:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 23:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 24:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 25:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 26:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 27:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 28:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C1031pe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0402 A[PHI: r1 r2
  0x0402: PHI (r1v82 java.util.Iterator) = (r1v80 java.util.Iterator), (r1v83 java.util.Iterator) binds: [B:168:0x03d8, B:180:0x0436] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r2v82 mq1) = (r2v81 mq1), (r2v83 mq1) binds: [B:168:0x03d8, B:180:0x0436] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0408  */
    /* JADX WARN: Code duplicated, block: B:173:0x0420  */
    /* JADX WARN: Code duplicated, block: B:176:0x0426  */
    /* JADX WARN: Code duplicated, block: B:179:0x0435  */
    /* JADX WARN: Code duplicated, block: B:181:0x0438  */
    /* JADX WARN: Code duplicated, block: B:250:0x058a  */
    /* JADX WARN: Code duplicated, block: B:517:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x02e2 -> B:125:0x02e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x041e -> B:174:0x0422). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:263:0x05b1 -> B:264:0x05b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x05b6 -> B:266:0x05b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1031pe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(yp1 yp1Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 17;
        this.f27555w = yp1Var;
        this.f27557y = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(C0459am c0459am, yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 8;
        this.f27557y = c0459am;
        this.f27555w = yp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(yp1 yp1Var, pz2 pz2Var, kr3 kr3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 15;
        this.f27554v = yp1Var;
        this.f27556x = pz2Var;
        this.f27557y = kr3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(pc3 pc3Var, nq1 nq1Var, yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 22;
        this.f27556x = pc3Var;
        this.f27557y = nq1Var;
        this.f27555w = yp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(ql3 ql3Var, v21 v21Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 12;
        this.f27556x = ql3Var;
        this.f27557y = v21Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(KeyguardManager keyguardManager, Activity activity, xn2 xn2Var, yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 11;
        this.f27554v = keyguardManager;
        this.f27556x = activity;
        this.f27557y = xn2Var;
        this.f27555w = yp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(Object obj, wm0 wm0Var, InterfaceC0755ia interfaceC0755ia, LinkedHashMap linkedHashMap, Map map) {
        super(2, wm0Var);
        this.f27552t = (byte) 19;
        this.f27554v = obj;
        this.f27555w = interfaceC0755ia;
        this.f27556x = linkedHashMap;
        this.f27557y = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1031pe(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f27552t = b;
        this.f27555w = obj;
        this.f27556x = obj2;
        this.f27557y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1031pe(Object obj, Object obj2, Object obj3, Object obj4, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f27552t = b;
        this.f27554v = obj;
        this.f27555w = obj2;
        this.f27556x = obj3;
        this.f27557y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1031pe(String str, ua5 ua5Var, wm0 wm0Var, Object obj, Object obj2, byte b) {
        super(2, wm0Var);
        this.f27552t = b;
        this.f27554v = str;
        this.f27555w = ua5Var;
        this.f27556x = obj;
        this.f27557y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(List list, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27552t = (byte) 20;
        this.f27557y = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031pe(wm0 wm0Var, C0751i6 c0751i6, C0341tf c0341tf, Set set) {
        super(2, wm0Var);
        this.f27552t = (byte) 25;
        this.f27554v = c0751i6;
        this.f27555w = c0341tf;
        this.f27556x = set;
    }
}
