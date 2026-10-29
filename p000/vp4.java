package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vp4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f32781t;

    /* JADX INFO: renamed from: u */
    public boolean f32782u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f32783v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f32784w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp4(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f32781t = b;
        this.f32783v = obj;
        this.f32784w = obj2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f32781t;
        Object obj2 = this.f32784w;
        switch (b) {
            case 0:
                return new vp4((yp1) this.f32783v, (a83) obj2, wm0Var, (byte) 0);
            case 1:
                vp4 vp4Var = new vp4((mq4) obj2, wm0Var, (byte) 1);
                vp4Var.f32783v = obj;
                return vp4Var;
            case 2:
                return new vp4((mq4) this.f32783v, (wp1) obj2, wm0Var, (byte) 2);
            case 3:
                vp4 vp4Var2 = new vp4((ti1) obj2, wm0Var, (byte) 3);
                vp4Var2.f32783v = obj;
                return vp4Var2;
            default:
                return new vp4((el3) this.f32783v, (View) obj2, wm0Var, (byte) 4);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32781t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((vp4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((vp4) create((wm0) obj2, (af4) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((vp4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((vp4) create((wm0) obj2, obj)).invokeSuspend(ju4Var);
            default:
                return ((vp4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x00f9 -> B:73:0x00fd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vp4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp4(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f32781t = b;
        this.f32784w = obj;
    }
}
