package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rm6 {

    /* JADX INFO: renamed from: a */
    public static final le6 f29427a;

    /* JADX INFO: renamed from: b */
    public static final le6 f29428b;

    static {
        li0 li0Var = new li0(he6.m6365a(), true, true);
        li0Var.m7986o("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        li0Var.m7986o("measurement.set_default_event_parameters_with_backfill.service", true);
        li0Var.m7985n("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f29427a = li0Var.m7986o("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f29428b = li0Var.m7986o("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        li0Var.m7986o("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
