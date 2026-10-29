package p000;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0367uz;
import ads_mobile_sdk.C0413y3;
import ads_mobile_sdk.a83;
import ads_mobile_sdk.sb3;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0934n5 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f25458A;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f25459t;

    /* JADX INFO: renamed from: u */
    public boolean f25460u;

    /* JADX INFO: renamed from: v */
    public Object f25461v;

    /* JADX INFO: renamed from: w */
    public Object f25462w;

    /* JADX INFO: renamed from: x */
    public Object f25463x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f25464y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f25465z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934n5(xz4 xz4Var, od1 od1Var, C1354y3 c1354y3, u93 u93Var, gr1 gr1Var, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25459t = (byte) 4;
        this.f25461v = xz4Var;
        this.f25462w = od1Var;
        this.f25463x = c1354y3;
        this.f25464y = u93Var;
        this.f25458A = gr1Var;
        this.f25465z = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f25459t;
        Object obj2 = this.f25464y;
        Object obj3 = this.f25458A;
        Object obj4 = this.f25465z;
        switch (b) {
            case 0:
                return new C0934n5((C0861l6) this.f25461v, (C1060q6) this.f25462w, (String) this.f25463x, (C0516c6) obj2, (sw2) obj4, (xn2) obj3, wm0Var, (byte) 0);
            case 1:
                return new C0934n5((C1033pg) this.f25462w, (lt0) this.f25463x, this.f25464y, (C0908mg) obj4, (i92) obj3, wm0Var);
            case 2:
                C0934n5 c0934n5 = new C0934n5((b80) this.f25463x, (C0910mi) obj2, (sw2) obj4, (sw2) obj3, wm0Var);
                c0934n5.f25462w = obj;
                return c0934n5;
            case 3:
                fk2 fk2Var = fk2.f19054a;
                return new C0934n5((gk2) obj2, (zo0) obj4, (ut4) obj3, wm0Var);
            case 4:
                return new C0934n5((xz4) this.f25461v, (od1) this.f25462w, (C1354y3) this.f25463x, (u93) obj2, (gr1) obj3, (sw2) obj4, wm0Var);
            case 5:
                return new C0934n5((sb3) this.f25461v, (Map.Entry) this.f25462w, (AbstractC1384yx) this.f25463x, (Map) obj4, (a83) obj3, (C0516c6) obj2, wm0Var);
            case 6:
                return new C0934n5((Bundle) obj4, (Bundle) obj3, (C0516c6) obj2, (sb3) this.f25461v, (String) this.f25463x, (String) this.f25462w, wm0Var);
            default:
                return new C0934n5((C1372yl) this.f25461v, (Uri) this.f25462w, (C0213l2) this.f25463x, (C0367uz) obj2, (C0413y3) obj4, (Boolean) obj3, wm0Var, (byte) 7);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25459t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C0934n5) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x024e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0258  */
    /* JADX WARN: Code duplicated, block: B:91:0x0266  */
    /* JADX WARN: Code duplicated, block: B:92:0x0268  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [ql3] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v26, types: [ql3] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x024c -> B:87:0x0250). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0934n5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934n5(b80 b80Var, C0910mi c0910mi, sw2 sw2Var, sw2 sw2Var2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25459t = (byte) 2;
        this.f25463x = b80Var;
        this.f25464y = c0910mi;
        this.f25465z = sw2Var;
        this.f25458A = sw2Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934n5(gk2 gk2Var, zo0 zo0Var, ut4 ut4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25459t = (byte) 3;
        fk2 fk2Var = fk2.f19054a;
        this.f25464y = gk2Var;
        this.f25465z = zo0Var;
        this.f25458A = ut4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934n5(C1033pg c1033pg, lt0 lt0Var, Object obj, C0908mg c0908mg, i92 i92Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25459t = (byte) 1;
        this.f25462w = c1033pg;
        this.f25463x = lt0Var;
        this.f25464y = obj;
        this.f25465z = c0908mg;
        this.f25458A = i92Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0934n5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f25459t = b;
        this.f25461v = obj;
        this.f25462w = obj2;
        this.f25463x = obj3;
        this.f25464y = obj4;
        this.f25465z = obj5;
        this.f25458A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934n5(sb3 sb3Var, Map.Entry entry, AbstractC1384yx abstractC1384yx, Map map, a83 a83Var, C0516c6 c0516c6, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25459t = (byte) 5;
        this.f25461v = sb3Var;
        this.f25462w = entry;
        this.f25463x = abstractC1384yx;
        this.f25465z = map;
        this.f25458A = a83Var;
        this.f25464y = c0516c6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934n5(Bundle bundle, Bundle bundle2, C0516c6 c0516c6, sb3 sb3Var, String str, String str2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25459t = (byte) 6;
        this.f25461v = sb3Var;
        this.f25463x = str;
        this.f25462w = str2;
        this.f25465z = bundle;
        this.f25458A = bundle2;
        this.f25464y = c0516c6;
    }
}
