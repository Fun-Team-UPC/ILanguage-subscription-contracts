package contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;


@Value
public class EditSubscription {
    @TargetAggregateIdentifier
    String subscriptionId;
    String name;
    int monthDuration;
    int price;
}
