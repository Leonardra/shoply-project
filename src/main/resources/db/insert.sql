set foreign_key_checks=0;
truncate table product;
truncate table feedback;

insert into product(`id`, `name`, `price`, `details`, `currency`)
values(110, 'luxury chair', 4500, 'Lorem Ipsum is slechts een proeftekst', 'NGN'),
    (111, 'luxury sofa', 4500, 'Lorem Ipsum is slechts een proeftekst', 'USD'),
    (112, 'luxury bench', 6500, 'Lorem Ipsum is slechts een proeftekst', 'FRC'),
    (113, 'luxury table', 8500, 'Lorem Ipsum is slechts een proeftekst', 'YEN');


set foreign_key_checks=1;