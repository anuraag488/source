package p000;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dh4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public int f17057A;

    /* JADX INFO: renamed from: B */
    public long f17058B;

    /* JADX INFO: renamed from: C */
    public byte f17059C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ nh4 f17060D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ml3 f17061E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AccessibilityService f17062F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Path f17063G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ long f17064H;

    /* JADX INFO: renamed from: t */
    public Object f17065t;

    /* JADX INFO: renamed from: u */
    public AccessibilityService f17066u;

    /* JADX INFO: renamed from: v */
    public Path f17067v;

    /* JADX INFO: renamed from: w */
    public int f17068w;

    /* JADX INFO: renamed from: x */
    public int f17069x;

    /* JADX INFO: renamed from: y */
    public int f17070y;

    /* JADX INFO: renamed from: z */
    public int f17071z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh4(nh4 nh4Var, ml3 ml3Var, AccessibilityService accessibilityService, Path path, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f17060D = nh4Var;
        this.f17061E = ml3Var;
        this.f17062F = accessibilityService;
        this.f17063G = path;
        this.f17064H = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new dh4(this.f17060D, this.f17061E, this.f17062F, this.f17063G, this.f17064H, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((dh4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0022, B:46:0x0151, B:48:0x0155, B:38:0x00e3, B:41:0x010d, B:42:0x0114, B:15:0x004e, B:18:0x0065, B:34:0x00cd, B:31:0x0091), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x010d A[Catch: all -> 0x0030, LOOP:0: B:37:0x00e1->B:41:0x010d, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0022, B:46:0x0151, B:48:0x0155, B:38:0x00e3, B:41:0x010d, B:42:0x0114, B:15:0x004e, B:18:0x0065, B:34:0x00cd, B:31:0x0091), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x014a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0155 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0022, B:46:0x0151, B:48:0x0155, B:38:0x00e3, B:41:0x010d, B:42:0x0114, B:15:0x004e, B:18:0x0065, B:34:0x00cd, B:31:0x0091), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x014a -> B:46:0x0151). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
