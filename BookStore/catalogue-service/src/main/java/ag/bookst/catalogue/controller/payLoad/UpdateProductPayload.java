package ag.bookst.catalogue.controller.payLoad;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UpdateProductPayload(
        @NotNull(message="{catalogue.products.update.errors.title_is_null}")
        @Size(min=3, max=50, message = "{catalogue.products.update.errors.title_size_is_invalid}")
        String title,

        @Size(max=1000, message = "{catalogue.products.update.errors.details_size_are_invalid}")
        String details) {
}
