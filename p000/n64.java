package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n64 extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ mq1 f25474A;

    /* JADX INFO: renamed from: t */
    public mq1 f25475t;

    /* JADX INFO: renamed from: u */
    public Map f25476u;

    /* JADX INFO: renamed from: v */
    public Iterator f25477v;

    /* JADX INFO: renamed from: w */
    public Object f25478w;

    /* JADX INFO: renamed from: x */
    public Map f25479x;

    /* JADX INFO: renamed from: y */
    public byte f25480y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Context f25481z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n64(Context context, mq1 mq1Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f25481z = context;
        this.f25474A = mq1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        return new n64(this.f25481z, this.f25474A, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0096 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:7:0x001e, B:32:0x00c1, B:26:0x0090, B:28:0x0096, B:33:0x00d0, B:12:0x002e, B:18:0x0048, B:19:0x0053, B:21:0x0059, B:23:0x0068, B:24:0x0070, B:25:0x0076, B:15:0x0039), top: B:38:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c0 -> B:32:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n64.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
