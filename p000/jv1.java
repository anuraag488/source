package p000;

import android.os.Vibrator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ long f22647A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ lv1 f22648B;

    /* JADX INFO: renamed from: t */
    public long f22649t;

    /* JADX INFO: renamed from: u */
    public long f22650u;

    /* JADX INFO: renamed from: v */
    public int f22651v;

    /* JADX INFO: renamed from: w */
    public int f22652w;

    /* JADX INFO: renamed from: x */
    public int f22653x;

    /* JADX INFO: renamed from: y */
    public boolean f22654y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Vibrator f22655z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv1(Vibrator vibrator, long j, lv1 lv1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22655z = vibrator;
        this.f22647A = j;
        this.f22648B = lv1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new jv1(this.f22655z, this.f22647A, this.f22648B, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((jv1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x001a, B:30:0x00e0, B:15:0x0052, B:17:0x0058, B:21:0x0078, B:26:0x00b5, B:25:0x00b1, B:20:0x0076), top: B:38:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x001a, B:30:0x00e0, B:15:0x0052, B:17:0x0058, B:21:0x0078, B:26:0x00b5, B:25:0x00b1, B:20:0x0076), top: B:38:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x001a, B:30:0x00e0, B:15:0x0052, B:17:0x0058, B:21:0x0078, B:26:0x00b5, B:25:0x00b1, B:20:0x0076), top: B:38:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00df -> B:30:0x00e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
