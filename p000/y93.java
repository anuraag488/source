package p000;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y93 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public Object f35042A;

    /* JADX INFO: renamed from: B */
    public /* synthetic */ Object f35043B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ Object f35044C;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f35045t = 0;

    /* JADX INFO: renamed from: u */
    public Iterator f35046u;

    /* JADX INFO: renamed from: v */
    public int f35047v;

    /* JADX INFO: renamed from: w */
    public int f35048w;

    /* JADX INFO: renamed from: x */
    public byte f35049x;

    /* JADX INFO: renamed from: y */
    public Object f35050y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f35051z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y93(xn2 xn2Var, C0459am c0459am, C1354y3 c1354y3, ac4 ac4Var, AccessibilityNodeInfo accessibilityNodeInfo, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35050y = xn2Var;
        this.f35051z = c0459am;
        this.f35042A = c1354y3;
        this.f35043B = ac4Var;
        this.f35044C = accessibilityNodeInfo;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f35045t;
        Object obj2 = this.f35044C;
        Object obj3 = this.f35051z;
        switch (b) {
            case 0:
                y93 y93Var = new y93((lv1) obj2, (xz4) obj3, wm0Var);
                y93Var.f35043B = obj;
                return y93Var;
            default:
                return new y93((xn2) this.f35050y, (C0459am) obj3, (C1354y3) this.f35042A, (ac4) this.f35043B, (AccessibilityNodeInfo) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35045t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((y93) create((wm0) obj2, (List) obj)).invokeSuspend(ju4Var);
            default:
                return ((y93) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0257  */
    /* JADX WARN: Code duplicated, block: B:82:0x025f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0263  */
    /* JADX WARN: Code duplicated, block: B:87:0x0285  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0120 -> B:35:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02c9 -> B:94:0x02ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y93.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y93(lv1 lv1Var, xz4 xz4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35044C = lv1Var;
        this.f35051z = xz4Var;
    }
}
